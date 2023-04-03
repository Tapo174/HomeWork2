from abc import abstractclassmethod
from ..animal import animal

class pet(animal):
    def __init__(self, name, height, weight, coloreye, nickname, breed, vaccination, wool, bday):
        self.nickname = nickname
        self.breed = breed
        self.vaccination = vaccination
        self.wool = wool
        self.bday = bday
        super(pet, self).__init__(name, height, weight, coloreye)

    def pet_me(self):
        print(f"{self.name} {self.nickname} погладь меня ^_^")

    def __str__(self) -> str:
        return (f"{super().__str__()}\nКличка: {self.nickname}\nПорода: {self.breed}\nПрививка: {self.vaccination}\nЦвет: {self.wool}\nДень рождения: {self.bday}")