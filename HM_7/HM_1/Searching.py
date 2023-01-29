def OppeningData():
    with open("data.txt", "r") as file:
        lst = file.readlines()
        Result = []
        for line in lst:
            a = line.split(",")
            Result.append(a)

    keyWord = input("Введите имя или фамилию: ")
    for word in Result:
        if word != keyWord:
            print (Result)
        else:
            print("что-то не так...")