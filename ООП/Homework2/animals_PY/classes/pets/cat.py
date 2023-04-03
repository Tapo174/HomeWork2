from .pet import pet

class cat(pet):
    def __init__(self, name, height, weight, coloreye, nickname, breed, vaccination, wool, bday):
        super().__init__(name, height, weight, coloreye, nickname, breed, vaccination, wool, bday)

    def voice(self):
       print(f"{super().voice()} Мяу")

    def pet_me(self):
        return super().pet_me()
    
    def __str__(self) -> str:
        return super().__str__()