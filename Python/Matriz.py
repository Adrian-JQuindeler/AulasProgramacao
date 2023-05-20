Matriz = [['O', 'L', 'Á'],['M', 'U', 'N'],['D', 'O', '!']]
for l in range(0,3,1):
    for c in range(0,3,1):
        print(f"[{Matriz[l][c]}] ", end="")
    print()

print("\033[4m---------------------------------------------\033[m")

MatrizInterativa = []
print("\033[1mMatriz Interativa - Digite os números e crie sua matriz\033[m")

lin = int(input("Quantas linhas terá a matriz?"))
col = int(input("Quantas colunas terá a matriz?"))
for l in range(0,lin,1):
    MatrizInterativa.append([])
    for c in range(0,col,1):
        numero = int(input(f"Digite um número para a posição[{l+1}][{c+1}] "))
        MatrizInterativa[l].append(numero)
    
for l in range(0,lin,1):
    for c in range(0,col,1):
        print(f"[{MatrizInterativa[l][c]:^3}] ", end="")
    print()

if lin == col:
    print(f"Diagonal Principal: ", end="")
    for i in range(0,lin,1):
        print(f"{MatrizInterativa[i][i]}", end=", " if i < 2 else ".")
