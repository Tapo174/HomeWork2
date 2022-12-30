# Задайте список из N элементов, заполненных числами из промежутка [-N, N]. 
# Найдите произведение элементов на указанных позициях.
# Позиции хранятся в файле file.txt в одной строке одно число.

N = [-2, -1, 0, 1, 2]
prod = (1)

path = 'HM_2\HM4t.txt'
data = open(path, 'r')
for line in data:
    line = int(line)
    for i in [N]:
        print (N[line], end=' ')

data.close()
    
        

