def MostrarProdutos(listaDeProdutos):
    print("\n\033[1;33;44m PRODUTOS: \033[m")
    for i in range(len(listaDeProdutos)):
        print(f"\033[1;33;44m    {listaDeProdutos[i][0]:.<24}", end = "")
        print(f"{listaDeProdutos[i][1]:.2f} \033[m")

def AdicionarItem(carrinho, listaDeProdutos):
    print("\n\033[1;33;44m Digite o número do produto que deseja adicionar. \033[m"
          "\n\033[1;33;44m Digite 0 para terminar. \033[m\n")
    while True:
        desejo = input("Qual produto deseja? ")
        for i in range(len(listaDeProdutos)):
            if desejo == '0':
                break
            elif desejo in listaDeProdutos[i][0][:4]:
                carrinho.append(listaDeProdutos[i])
                break
        else:
                print("Produto não encontrado.") 
        if desejo == '0': 
            break

def RemoverItem(carrinho):
    if len(carrinho) == 0:
        print("\n\033[1;33;44m O carrinho está vazio. \033[m")
    else:    
        print("\n\033[1;33;44m Digite o número do produto que deseja remover. \033[m"
            "\n\033[1;33;44m Digite 0 para terminar. \033[m\n")
        while True:
                desejo = input("Qual produto deseja remover? ")
                for i in range(len(carrinho)):
                    if desejo == '0':
                        break
                    if desejo in carrinho[i][0][:3]:
                        carrinho.remove(carrinho[i])
                        break
                else:
                    print("Produto não encontrado no carrinho.")   
                if desejo == '0':
                    break

def MostrarCarrinho(carrinho):
    if len(carrinho) == 0:
        print("\n\033[1;33;44m O carrinho está vazio. \033[m")
    else:
        print("\n\033[1;33;44m PRODUTOS ESCOLHIDOS: \033[m")
        carrinho.sort()
        for i in range(len(carrinho)):
            print(f"\033[1;33;44m    {carrinho[i][0]:.<24}", end = "")
            print(f"{carrinho[i][1]:.2f} \033[m")

def MostrandoCompra(carrinho):
    total = 0
    carrinho.sort()
    print(f"\033[1;33;44m Seu carrinho: \033[m")
    for i in range(len(carrinho)):
        print(f"\033[1;33;44m    {carrinho[i][0]:.<25}", end = "")
        print(f"{carrinho[i][1]:.2f}\033[m")
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
print("\033[1;33;44m===================================\033[m")
print("\033[1;33;44m     Adrian's & Adrian's LTDA.     \033[m")
print("\033[1;33;44m===================================\033[m")

carrinho = []
while True:
    caminho = int(input("\nO que quer fazer?"
                    "\n[1] Ver a lista de produtos"
                    "\n[2] Adicionar item ao carrinho"
                    "\n[3] Remover item do carrinho"
                    "\n[4] Mostrar carrinho"
                    "\n[5] Finalizar compra"
                    "\nSua resposta: "))
    if caminho == 1:
        #Mostrando os produtos de forma organizada
        MostrarProdutos(listaDeProdutos)
        
    elif caminho == 2:
        #Colocando produtos no carrinho do cliente
        AdicionarItem(carrinho, listaDeProdutos)
    
    elif caminho == 3:
        #Removendo produtos no carrinho do cliente
        RemoverItem(carrinho)    

    elif caminho == 4:
        #Mostrando o carrinho do cliente
        MostrarCarrinho(carrinho)
    
    elif caminho == 5:
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
