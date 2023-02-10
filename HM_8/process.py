

def new_student():
    name = input("Введите Имя ученика: ")
    return name

def new_lesson():
    lesson = input("Введите предмет: ")
    return lesson
def new_mark():
    name = input("Введите имя студента: ")
    lesson = input("Введите предмет: ")
    mark = input("Введите оценку: ")
    return mark, name, lesson
def show_marks():
    name = input("Введите имя студента: ")
    lesson = input("Введите предмет: ")
    return name, lesson