import classes
import copy

class Zoo():
    all = []
    animal = classes.wild_hen("Курица", 30, 2, "Желтый", 20)
    all.append(copy.copy(animal))
    animal = classes.stork("Аист", 50, 4, "Желтый", 40)
    all.append(copy.copy(animal))
    animal = classes.wolf("Волк", 100, 50, "Голубой", "Тундра", "13.12.2011", True)
    all.append(copy.copy(animal))
    animal = classes.cat("Кот", 23, 3, "Зелёные", "Серик", "Метис", "Да", "Серый", "Неизвестно")
    all.append(copy.copy(animal))
    animal = classes.dog("Собака", 45, 24, "Карие", "Шарик", "Дворняга", "Да", "Чёрный", "Неизвестно")
    all.append(copy.copy(animal))
    animal = classes.tiger("Тигр", 130, 200, "Жёлтый", "Приморский край", "13.12.2011")
    all.append(copy.copy(animal))