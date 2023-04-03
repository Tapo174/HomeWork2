from ..interfaces.training import training 
from .pet import pet

class dog(pet):
    def __init__(self, name, height, weight, coloreye, nickname, breed, vaccination, wool, bday):
        super().__init__(name, height, weight, coloreye, nickname, breed, vaccination, wool, bday)

    def voice(self):
       print(f"{super().voice()} Гав-гав")

    def pet_me(self):
        return super().pet_me()
    
    def training(self):
        training.trainig(self)
    
    def __str__(self) -> str:
        return (f"{super().__str__()}")