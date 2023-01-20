import random
board = list(range(1,10))
victory = [[0,1,2], [3,4,5], [6,7,8], [0,3,6], [1,4,7], [2,5,8], [0,4,8], [2,4,6]]

player1 = input("Введите имя первого игрока: ")
player2 = input("Введите имя второго игрока: ")

first_turn = random.choice([player1, player2])

def design_board(board):
    print('-'*12)
    for i in range(3):
        print('|', board[0+i*3],'|', board[1+i*3], '|', board[2+i*3], '|')
        print('-'*12)

design_board(board)

game_over = False
cur_turn = first_turn

def check_victory():
    for i in victory:
        if board[i[0]] == board[i[1]] == board[i[2]]:
            return True
        else:
            return False

while not game_over:
    if cur_turn == first_turn:
        symbol = "X"
        step = int(input("Выберите ячейку: "))
        if board[int(step) - 1] == "X"  or board[int(step) - 1] == "O":
            print("Уже занято!")
            continue
        board[step - 1] = symbol
        design_board(board)
    else:
        symbol = "O"
        step = int(input("Выберите ячейку: "))
        if board[int(step) - 1] == "X"  or board[int(step) - 1] == "O":
            print("Уже занято!")
            continue
        board[step - 1] = symbol
        design_board(board)
    if check_victory():
        print(f' Победил игрок {cur_turn}')
        design_board(board)
        break
    cur_turn = player1 if cur_turn == player2 else player2