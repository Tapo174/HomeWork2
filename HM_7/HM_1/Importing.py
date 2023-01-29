def ImportData():
    id = str(input("Введите id контакта: "))
    LastName = str(input("Введите Фамилию: "))
    name = str(input("Введите имя: "))
    number =  str(input("Введите номер: "))
    comment = str(input("Введите коментарий: "))
    lst = f' {id}, {LastName}, {name}, {number}, {comment} \n'
    with open('data.txt', 'a') as file:
        file.write(lst)
    print(f"Контакт {LastName} {name} сохранён!")