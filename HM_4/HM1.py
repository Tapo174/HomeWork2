# Вычислить число c заданной точностью d

d = int(input('Введите нужное колличество знаков после запятой для π: '))

import math
print(round(math.pi, d))