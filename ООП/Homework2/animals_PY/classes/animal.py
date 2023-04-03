from abc import ABC, abstractclassmethod

class animal(ABC):
    def __init__(self, name, height, weight, coloreye):
        self.name = name
        self.height = height
        self.weight = weight
        self.coloreye = coloreye

    def __str__(self) -> str:
        return f"{self.name}\nРост: {self.height}\nВес: {self.weight}\nЦвет глаз: {self.coloreye}"
    
    def voice(self):
        return (f"{self.name}: ")