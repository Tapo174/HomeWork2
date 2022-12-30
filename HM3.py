# Задайте список из n чисел последовательности $(1+\frac 1 n)^n$ и выведите на экран их сумму.


N = int(input('Введите число: ')) 

result = [round((1 + 1 / i)**i, 2) for i in range (1, N + 1)]   
        
print(result)
print(round(sum(result)))