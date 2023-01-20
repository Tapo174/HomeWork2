# Реализуйте RLE алгоритм: реализуйте модуль сжатия и восстановления данных.

a = '111112222334445'

b = []
count = None
for i in a:
    if i != count:
        b.append(i)
        b.append(str(1))
        count = i
    else:
        b[-1] = str(int(b[-1]) + 1)
res1 = ("".join(b))

print(f'{a} --> {res1}')

temp = ''
temp2 = ''
res2 = ''
for i in range(1, len(res1), 2):
    temp = res1[i]
    temp2 = res1[i-1]
    res2 += temp2 * int(temp)

print(f'{res1} --> {res2}')
