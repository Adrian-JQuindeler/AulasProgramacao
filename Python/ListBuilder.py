lista = []
quantidade = int(input("quantos números seão colocados na lista: "))
for num in range(0, quantidade):
    valor = int(input("Digite um número para entrar na lista: "))
    if num == 0 or valor >= lista[-1]:
            lista.append(valor)
            print("Item adicionado ao final da lista.")
    else:
        for num in range(0, len(lista)):
            if valor < lista[num]:
                 lista.insert(num, valor)
                 print(f"Item adicionado na posição {num}.")
                 break
print("\n",lista)