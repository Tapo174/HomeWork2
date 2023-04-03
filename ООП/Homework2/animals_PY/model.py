import copy
import classes
import zoo

def show_all():
    for i in range(len(zoo.Zoo.all)):
        print(f"{i+1}) {zoo.Zoo.all[i]}")

def show_info(num):
    print(f"{num - 1} {zoo.Zoo.all[num - 1]}")
    if (isinstance(zoo.Zoo.all[num - 1], classes.pet)):
        zoo.Zoo.all[num - 1].petting()
    if (isinstance(zoo.Zoo.all[num - 1], classes.trainig)):
        zoo.Zoo.all[num - 1].training()
    if (isinstance(zoo.Zoo.all[num - 1], classes.bird)):
        zoo.Zoo.all[num - 1].fly()

def voice_all():
    for i in range(len(zoo.Zoo.all)):
        zoo.Zoo.all[i].voice()

def animal_voice(num):
    zoo.Zoo.all[num-1].voice()

def add_animal(num):
    match num:
        case 1:
            add_cat()
        case 2:
            add_tiger()
        case 3:
            add_dog()
        case 4:
            add_wolf()
        case 5:
            add_hen()
        case 6:
            add_stork()

def add_cat():
    name = "Кот"
    height = int(input("Рост: "))
    weight = int(input("Вес: "))
    colorEye = input("Цвет глаз: ")
    nickname = input("Кличка: ")
    breed = input("Порода: ")
    vaccination = input("Наличие прививки: ")
    wool = input("Цвет шерсти: ")
    date = input("Дата рождения: ")
    animal = classes.Cat(name, height, weight, colorEye, nickname, breed, vaccination, wool, date)
    zoo.Zoo.all.append(copy.copy(animal))

def add_dog():
    name = "Собака"
    height = int(input("Рост: "))
    weight = int(input("Вес: "))
    colorEye = input("Цвет глаз: ")
    nickname = input("Кличка: ")
    breed = input("Порода: ")
    vaccination = input("Наличие прививки: ")
    wool = input("Цвет шерсти: ")
    date = input("Дата рождения: ")
    animal = classes.dog(name, height, weight, colorEye, nickname, breed, vaccination, wool, date,)
    zoo.Zoo.all.append(copy.copy(animal))

def add_tiger():
    name = "Тигр"
    height = int(input("Рост: "))
    weight = int(input("Вес: "))
    colorEye = input("Цвет глаз: ")
    place = input("Среда обитания: ")
    date = input("Дата обнаружения: ")
    animal = classes.tiger(name, height, weight, colorEye, place, date)
    zoo.Zoo.all.append(copy.copy(animal))

def add_wolf():
    name = "Волк"
    height = int(input("Рост: "))
    weight = int(input("Вес: "))
    colorEye = input("Цвет глаз: ")
    place = input("Среда обитания: ")
    date = input("Дата обнаружения: ")
    leader = bool(input("Вожак стаи? True/False: "))
    animal = classes.wolf(name, height, weight, colorEye, place, date, leader)
    zoo.Zoo.all.append(copy.copy(animal))

def add_hen():
    name = "Курица"
    height = int(input("Рост: "))
    weight = int(input("Вес: "))
    colorEye = input("Цвет глаз: ")
    fly = int(input("Высота полета: "))
    animal = classes.wild_hen(name, height, weight, colorEye, fly)
    zoo.Zoo.all.append(copy.copy(animal))

def add_stork():
    name = "Аист"
    height = int(input("Рост: "))
    weight = int(input("Вес: "))
    colorEye = input("Цвет глаз: ")
    fly = int(input("Высота полета: "))
    animal = classes.stork(name, height, weight, colorEye, fly)
    zoo.Zoo.all.append(copy.copy(animal))

def delete_animal(num):
    zoo.Zoo.all.pop(num - 1)