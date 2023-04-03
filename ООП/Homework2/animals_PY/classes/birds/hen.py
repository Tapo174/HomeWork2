from ..interfaces.flying import flying
from .bird import bird

class wild_hen(bird, flying):
    def __init__(self, name, height, weight, coloreye, flying_height):
        super().__init__(name, height, weight, coloreye, flying_height)

    def voice(self):
       print(f"{super().voice()} ко-ко-ко")

    def fly(self):
        flying.fly(self)
    
    def __str__(self) -> str:
        return super().__str__()