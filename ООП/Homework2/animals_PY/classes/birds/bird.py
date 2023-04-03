from abc import abstractclassmethod
from ..animal import animal

class bird(animal):
    def __init__(self, name, height, weight, coloreye, flying_height):
        self.flying_height = flying_height
        super(bird, self).__init__(name, height, weight, coloreye)