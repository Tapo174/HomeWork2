def ShowData():
    with open("data.txt", "r") as file:
        #lst = file.readlines()
        for line in file.readlines():
            #if len(lst) == 0:
            print(line, end="")
            #else:
                #print("Список пуст!")