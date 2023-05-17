def MostrarProdutos(listaDeProdutos):
    print("\nPRODUTOS: ")
    for i in range(0, len(listaDeProdutos)):
        print(f"    {listaDeProdutos[i][0]:.<25}", end = "")
        print(f"{listaDeProdutos[i][1]:.2f}")

def ColocarNoCarrinho(carrinho, listaDeProdutos):
    while True:
        desejo = input("Qual produto deseja? ")
        for i in range(0, len(listaDeProdutos)):
            if desejo in listaDeProdutos[i][0][:4]:
                carrinho.append([listaDeProdutos[i][0],listaDeProdutos[i][1]])
        fim = input("Deseja mais algum produto? [S/N] ").lower()
        if fim[0] == "n":
            break

def MostrandoCompra(carrinho):
    total = 0
    carrinho.sort()
    print(f"Os produtos escolhidos foram: ")
    for i in range(0, len(carrinho)):
        print(f"    {carrinho[i][0]:.<25}", end = "")
        print(f"{carrinho[i][1]:.2f}")
        total += carrinho[i][1]
    print(f"O valor total é: {total:.2f}")

#Criando a lista com os produtos vendidos
listaDeProdutos = [
    ["[1] PLACA-MÃE", 956.81],
    ["[2] PROCESSADOR", 729.99],
    ["[3] SSD", 649.00],
    ["[4] MEMÓRIA RAM 16GB", 314.25],
    ["[5] GABINETE", 135.46],
    ["[6] COOLER", 159.69],
    ["[7] MONITOR", 861.47]]

#Mostrando o nome da empresa
print("\033[4,45m-----------------------------------\033[m")
print("\033[1,45m{:^38}".format("Adrian's & Adrian's LTDA.\033[m"))
print("\033[9,45m___________________________________\033[m\n")

#Mostrando os produtos de forma organizada
MostrarProdutos(listaDeProdutos)

carrinho = []
while True:
    caminho = int(input("\nO que quer fazer?"
                    "\n[1] Ver a lista de produtos"
                    "\n[2] Comprar um produto"
                    "\n[3] Finalizar compra"
                    "\nSua resposta: "))
    if caminho == 1:
        #Mostrando os produtos de forma organizada
        MostrarProdutos(listaDeProdutos)
        
    elif caminho == 2:
        #Colocando produtos no carrinho do cliente
        ColocarNoCarrinho(carrinho, listaDeProdutos)
        
    
    elif caminho == 3:
        #Terminando a venda
        MostrandoCompra(carrinho)
        resposta = input("Deseja finalizar a compra? [S/N] ").lower()
        
        #Conclusão e despedida
        if resposta == 's':
            print("Obrigado por comprar na Adrian's & Adrian's, agradecemos sua visita.")
            break
        else:
            print("Compra cancelada.")
        break
    else:
        print("Resposta inválida!")
print("Volte Sempre")
