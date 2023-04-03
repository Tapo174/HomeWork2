from .wild import Wild

class wolf(Wild):
    def __init__(self, name, height, weight, coloreye, place, date, leader):
        self.leader = leader
        super(wolf, self).__init__(name, height, weight, coloreye, place, date)

    def voice(self):
       print(f"{super().voice()} аууу")

    def __str__(self):
        if (self.leader == True):
            return f"{super().__str__()}\nСреда обитания: {self.place}\nДата нахождения: {self.date}\nВожак стаи"
        else:
            return f"{super().__str__()}\nСреда обитания: {self.place}\nДата нахождения: {self.date}"