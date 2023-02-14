import telebot
from telebot import types
import random
import time

bot = telebot.TeleBot("6017611869:AAEM_yakYTP_mTG8zPhSKponIsVjtWwaN0k")

sweets = 130
max_sweets = 28

@bot.message_handler(commands = ["start"])
def start(message):
    bot.send_message(message.chat.id, "Вызвать меню?  yes/no ")


@bot.message_handler(content_types= ["text"])
def button(message):
    if message.text == "yes":
        markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
        but1 = types.KeyboardButton("Сыграть в конфетки")
        markup.add(but1)
        bot.send_message(message.chat.id, "Выбери ниже", reply_markup=markup)
    elif message.text == "no":
        bot.send_message(message.chat.id, "Спрошу еще раз...")
        start(message)
    elif message.text == "Сыграть в конфетки":
        bot.send_message(message.chat.id, "Стартуем")
        time.sleep(3) #имитация ожидания
        rules(message)
    elif message.text != "no" and message.text != "Сыграть в конфетки" and message.text != "yes":
        bot.send_message(message.chat.id, "Что-то не так...")
        start(message)


def first_turn(message):
    Player = "Вы"
    Bot = "Бот"
    cur_turn = random.choice([Player, Bot])
    bot.send_message(message.chat.id,"Выбираю, кто ходит первым...")
    time.sleep(2)
    bot.send_message(message.chat.id,f'Первым ходит: {cur_turn}')
    if cur_turn == Player: 
        players_turn(message)
    elif cur_turn == Bot:
        bot_turn(message)


def rules(message):
    bot.send_message(message.chat.id, "Правила игры:\n\
        Перед вами 2021 конфета, вам предстоить отобрать их у бота, но за один ход можно брать не больше 28 конфет, кто первый заберёт последние конфеты считает победителем!\n\
        Удачи!")
    time.sleep(3) 
    first_turn(message)


@bot.message_handler(content_types= ["text"])
def players_turn(message):
    bot.send_message(message.chat.id,"Ваш ход")
    bot.send_message(message.chat.id,f'конфет осталость {sweets}, сколько возьмёте?')
    bot.register_next_step_handler(message, sweets_count)


@bot.message_handler(content_types= ["text"])
def sweets_count(message):
    global sweets
    global max_sweets
    num = int(message.text)
    sweet_num = num
    if sweet_num <= max_sweets and sweet_num < sweets:
        sweets = sweets - sweet_num
        bot.send_message(message.chat.id,f'Конфет сталось {sweets}')
        bot_turn(message)
    elif sweet_num == sweets:
        sweets = sweets - sweet_num
        bot.send_message(message.chat.id,f'Конфет сталось {sweets}')
        bot.send_message(message.chat.id,"Победа!")
    else:
        bot.send_message(message.chat.id,"Неверное количество конфет, введите ещё раз")
        players_turn(message)


def bot_turn(message):
    global sweets
    global max_sweets
    sweet_num = random.randint(1, max_sweets)
    if sweet_num <= max_sweets and sweet_num < sweets:
        sweets = sweets - sweet_num
        time.sleep(2)
        bot.send_message(message.chat.id,f'Бот взял {sweet_num}')
        players_turn(message)
    elif sweet_num >= sweets:
        sweet_num == sweets
        bot.send_message(message.chat.id,f'Бот взял {sweets}')
        time.sleep(2)
        sweets = sweets - sweet_num
        bot.send_message(message.chat.id,f'Конфет сталось {sweets}')
        bot.send_message(message.chat.id,"Поражение...")
    

bot.infinity_polling()