# Задайте список из вещественных чисел. 
# Напишите программу, которая найдёт разницу между максимальным и минимальным значением дробной части элементов.

a = [1.1, 1.2, 3.1, 5, 10.01]

b = [round(i % 1, 2) for i in a if i % 1 != 0]
print(max(b) - min(b))