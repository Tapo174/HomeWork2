from ..animal import animal

class Wild(animal):
    def __init__(self, name, height, weight, coloreye, place, date):
        self.place = place
        self.date = date
        super(Wild, self).__init__(name, height, weight, coloreye)