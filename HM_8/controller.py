import process

main_dct = {}
students_name = []
lessons = []
def The_process():
    while True:
        print("Что хотите сделать? \n\
        1 - Добавить студента\n\
        2 - Добавить предмет\n\
        3 - Добавить оценку по предмету\n\
        4 - Вывести список учеников\n\
        5 - Показать оценки ученика\n\
        6 - Выход")
        choice = int(input("Выберите функцию: "))
        if choice == 1:
            name = process.new_student()
            main_dct[name] = {}
            students_name.append(name)
            if lessons:
                for lesson in lessons:
                    main_dct[name][lesson] = []
        elif choice == 2:
            lesson = process.new_lesson()
            lessons.append(lesson)
            for name in students_name:
                main_dct[name][lesson] = []
        elif choice == 3:
            name, lesson, mark = process.new_mark()
            main_dct[name][lesson].append(mark)
        elif choice == 4:
            print (main_dct)
        elif choice == 5:
            name, lesson = process.show_marks
            print(f'оценки {name}: {main_dct[name]}')
        elif choice == 6:
            print("До встречи!")
            break
        print (main_dct)