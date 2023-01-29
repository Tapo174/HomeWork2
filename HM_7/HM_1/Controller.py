import Importing, Searching, View

def Greteengs():
    print("Вас приветствует справочник. ")

def SepSymbol():
    sep = input("Введите разделяющий символ(пробел или запятая): ")
    return sep

def The_proceess(): 
    while True:
        print("Что хотите сделать? \n\
        1 - поиск контакта(в разработке)\n\
        2 - импорт данных\n\
        3 - посмотреть контакты\n\
        4 - выход из справочника")
        choice = int(input("Выберите функцию: "))
        if choice == 1:
            Searching.OppeningData()
        if choice == 2:
            Importing.ImportData()
        if choice == 3:
            View.ShowData()
        if choice == 4:
            print("Всего хорошего!")
            break