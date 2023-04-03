import zoo

def menu():
    print("\n1. Добавить животное в зоопарк\n"
          "2. Удалить животное из зоопарка\n"
          "3. Просмотреть информацию о конкретном животном\n"
          "4. Прослушать звук конкретного животного\n"
          "5. Просмотреть информацию о всех животных в зоопарке\n"
          "6. Прослушать звук всех животных\n"
          "7. Выйти")
    num = int(input("Выберите пункт меню: "))
    return num

def menu_add_animal():
    print("\n1. Добавить кота\n"
          "2. Добавить тигра\n"
          "3. Добавить собаку\n"
          "4. Добавить волка\n"
          "5. Добавить курицу\n"
          "6. Добавить аиста\n"
          "7. Выйти")
    num = int(input("Выберите пункт меню: "))
    return num

def menu_delete_animal():
    print(f"{len(zoo.Zoo.all) + 1} Назад")
    num = int(input("Выберите кого хотите удалить: "))
    return num

def menu_show_animal():
    print(f"{len(zoo.Zoo.all) + 1} Назад")
    num = int(input("Выберите о ком хотите узнать: "))
    return num

def menu_animal_voice():
    print(f"{len(zoo.Zoo.all) + 1} Назад")
    num = int(input("Выберите кого хотите послушать: "))
    return num