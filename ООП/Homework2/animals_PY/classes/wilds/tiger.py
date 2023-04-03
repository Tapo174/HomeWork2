from .wild import Wild

class tiger(Wild):
    def __init__(self, name, height, weight, coloreye, place, date):
        super(tiger, self).__init__(name, height, weight, coloreye, place, date)

    def voice(self):
       print(f"{super().voice()} РрРрР")