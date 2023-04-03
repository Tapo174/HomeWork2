import model
import view
import zoo

def start():
    num = view.menu()
    match num:
        case 1:
            add_animal()
        case 2:
            delete_animal()
        case 3:
            animal_info()
        case 4:
            voice()    
        case 5:
            model.show_all()
            start()
        case 6:
            model.voice_all()
            start()
        case 7:
            print("Возвращайтесь!")
            exit()

def add_animal():
    num = view.addAnimal()
    if(num > len(zoo.Zoo.all)):
        start()
    else: model.add_animal(num)
    start()

def delete_animal():
    model.show_all()
    num = view.menu_delete_animal()
    if (num > len(zoo.Zoo.all)):
        start()
    else:
        model.delete_animal(num)
        start()

def animal_info():
    model.show_all()
    num = view.menu_show_animal()
    if(num > len(zoo.Zoo.all)):
        start()
    else:
        model.show_info(num)
        start()


def voice():
    model.show_all()
    num = view.menu_animal_voice()
    if(num > len(zoo.Zoo.all)):
        start()
    else:
        model.animal_voice(num)
        start()