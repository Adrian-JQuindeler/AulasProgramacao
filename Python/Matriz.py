Matriz = [['O', 'L', 'Á'],['M', 'U', 'N'],['D', 'O', '!']]
for l in range(0,3,1):
    for c in range(0,3,1):
        print(f"[{Matriz[l][c]}] ", end="")
    print()

print("\033[4m---------------------------------------------\033[m")

MatrizInterativa = [[0, 0, 0],[0, 0, 0],[0, 0, 0]]
print("\033[1mMatriz Interativa - Digite os números e crie sua matriz 3x3\033[m")

for l in range(0,3,1):
    for c in range(0,3,1):
        numero = int(input(f"Digite um número para a posição[{l+1}][{c+1}] "))
        MatrizInterativa[l][c] = numero
    
for l in range(0,3,1):
    for c in range(0,3,1):
        print(f"[{MatrizInterativa[l][c]}] ", end="")
    print()

print(f"Diagonal Principal: ")
for i in range(0,3,1):
    print(f"{MatrizInterativa[i][i]}", end=", " if i < 2 else ".")
