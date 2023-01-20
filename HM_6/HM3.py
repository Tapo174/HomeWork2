# Задача 32:  Напишите программу, которая на вход принимает два числа A и B, и возводит число А в целую степень B с помощью рекурсии.

A = int(input("Введите число: "))
B = int(input("Введите степень: "))

# res = A               #неправильный вариант, но рабочий :D
# while B !=1:
#     res = res * A
#     B = B - 1
# print(res)  


res = A
def result(A,B, res):
    if B == 1:
        return res
    return result(A,B - 1, res * A)

print(result(A, B, res))

