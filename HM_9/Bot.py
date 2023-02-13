import telebot
from telebot import types
import random
import time

bot = telebot.TeleBot("6017611869:AAEM_yakYTP_mTG8zPhSKponIsVjtWwaN0k")


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
        #time.sleep(3)
        rules(message)
    elif message.text != "no" and message.text != "Сыграть в конфетки" and message.text != "yes":
        bot.send_message(message.chat.id, "Что-то не так...")
        start(message)


@bot.message_handler(content_types= ["text"])
def the_game(message):
    Player = "Вы"
    Bot = "Бот"
    cur_turn = random.choice([Player])
    bot.send_message(message.chat.id,"Выбираю, кто ходит первым...")
    #time.sleep(2)
    bot.send_message(message.chat.id,f'Первым ходит: {cur_turn}')
    sweets = 2021
    while sweets > 0:
        if cur_turn == Player: 
            bot.send_message(message.chat.id,"Ваш ход")
            bot.send_message(message.chat.id,f'конфет осталость {sweets}, сколько возьмёте?')
            bot.register_next_step_handler(message, players_turn)
            sweet_num = num
            if sweet_num <= 28 and sweet_num <= sweets:
                sweets = sweets - sweet_num
            else:
                bot.send_message(message.chat.id,"Неверное количество конфет")



def rules(message):
    bot.send_message(message.chat.id, "Правила игры:\n\
        Перед вами 2021 конфета, вам предстоить отобрать их у бота, но за один ход можно брать не больше 28 конфет, кто первый заберёт последние конфеты считает победителем!\n\
        Удачи!")
    #time.sleep(3)
    the_game(message)

def players_turn(message):
    global num
    num = int(message.text)



bot.infinity_polling()