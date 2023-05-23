def MostrarProdutos(listaDeProdutos):
    print("\n\033[1;33;44m PRODUTOS: \033[m")
    for i in range(len(listaDeProdutos)):
        print(f"\033[1;33;44m    {listaDeProdutos[i][0]:.<35}", end = "")
        if listaDeProdutos[i][1] < 100:
            print(f"..{listaDeProdutos[i][1]:.2f} \033[m")
        elif listaDeProdutos[i][1] < 1000:
            print(f".{listaDeProdutos[i][1]:.2f} \033[m")
        else:
            print(f"{listaDeProdutos[i][1]:.2f} \033[m")

def MostrarEspecificações(Especificações):
    print("\n\033[1;33;44m ESPECIFICAÇÕES: \033[m")
    for i in range(len(Especificações)):
        print(f"\033[1;33;44m    {Especificações[i]}\033[m")

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
                if i < 10:
                    print(f"{listaDeProdutos[i][0][4:]} Adicionado ao carrinho!\n")
                elif i >= 10:
                    print(f"{listaDeProdutos[i][0][5:]} Adicionado ao carrinho!\n")
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
                        print(f"{listaDeProdutos[i][0][3:]} Removido do carrinho!\n")
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
            print(f"\033[1;33;44m    {carrinho[i][0]:.<35}", end = "")
            if carrinho[i][1] < 100:
                print(f"..{carrinho[i][1]:.2f} \033[m")
            elif carrinho[i][1] < 1000:
                print(f".{carrinho[i][1]:.2f} \033[m")
            else:
                print(f"{carrinho[i][1]:.2f} \033[m")

def MostrandoCompra(carrinho):
    total = 0
    carrinho.sort()
    print(f"\033[1;33;44m Seu carrinho: \033[m")
    for i in range(len(carrinho)):
        print(f"\033[1;33;44m    {carrinho[i][0]:.<35}", end = "")
        if carrinho[i][1] < 100:
            print(f"..{carrinho[i][1]:.2f} \033[m")
        elif carrinho[i][1] < 1000:
            print(f".{carrinho[i][1]:.2f} \033[m")
        else:
            print(f"{carrinho[i][1]:.2f} \033[m")
        total += carrinho[i][1]
    print(f"\033[1;33;44m    {'O valor total é:':.<35}", end = "")
    if total < 100:
        print(f"..{total:.2f} \033[m")
    elif total < 1000:
        print(f".{total:.2f} \033[m")
    else:
        print(f"{total:.2f} \033[m")

def FinalizarCompra(CEP):
    if len(carrinho) == 1:
        print(f"Obrigado por comprar na Adrian's & Adrian's {nome},"
        f"\nQualquer novidade, enviaremos para o email: {email}."
        f"\nO produto chegará no CEP {CEP[:1]}.{CEP[2:5]}-{CEP[-3:]} em até 30 dias."
        "\nAgradecemos sua visita.")
    else:
        print(f"Obrigado por comprar na Adrian's & Adrian's {nome},"
        f"\nQualquer novidade, enviaremos para o email: {email}."
        f"\nOs produtos chegaram no CEP {CEP[:1]}.{CEP[2:5]}-{CEP[-3:]} em até 30 dias."
        "\nAgradecemos sua visita.")

#Criando a lista com os produtos vendidos
listaDeProdutos = [
    ["[1] PLACA-MÃE", 621.81],
    ["[2] PROCESSADOR", 729.99],
    ["[3] SSD", 249.00],
    ["[4] MEMÓRIA RAM 16GB", 314.25],
    ["[5] GABINETE", 135.46],
    ["[6] COOLER", 55.99],
    ["[7] MONITOR", 761.47],
    ["[8] FONTE", 98.25],
    ["[9] MOUSE", 115.50],
    ["[10] MOUSE PAD", 22.13],
    ["[11] COOLER + PROCESSADOR + SSD", 999.99],
    ["[12] PLACA-MÃE + MEMÓRIA RAM", 815.20]]

Especificações = ["Placa-Mãe Asus Prime A520M-E. ",
    "Processador ",
    "SSD",
    "Memória RAM 16gb",
    "Gabinete",
    "Cooler",
    "Monitor",
    "Fonte",
    "MOUSE",
    "Mouse pad",
    "Cooler + Processador + SSD",
    "Placa-Mãe + Memória RAM"]

#Mostrando o nome da empresa
print("\033[1;33;44m===================================\033[m")
print("\033[1;33;44m     Adrian's & Adrian's LTDA.     \033[m")
print("\033[1;33;44m===================================\033[m")

carrinho = []

nome = input("Informe seu nome: ")
email = input("Seu email: ")
while True:
    caminho = int(input("\nO que deseja fazer?"
                    "\n[1] Ver a lista de produtos"
                    "\n[2] Mostrar especificações"
                    "\n[3] Adicionar item ao carrinho"
                    "\n[4] Remover item do carrinho"
                    "\n[5] Mostrar carrinho"
                    "\n[6] Finalizar compra"
                    "\nSua resposta: "))
    if caminho == 1:
        #Mostrando os produtos de forma organizada
        MostrarProdutos(listaDeProdutos)
    
    elif caminho == 2:
        #Mostrando especificações dos produtos
        MostrarEspecificações(Especificações)
        
    elif caminho == 3:
        #Colocando produtos no carrinho do cliente
        AdicionarItem(carrinho, listaDeProdutos)
    
    elif caminho == 4:
        #Removendo produtos no carrinho do cliente
        RemoverItem(carrinho)    

    elif caminho == 5:
        #Mostrando o carrinho do cliente
        MostrarCarrinho(carrinho)
    
    elif caminho == 6:
        if len(carrinho) == 0:
            print("\n\033[1;33;44m Nenhum item foi selecionado. \033[m")
        else:
            #Terminando a venda
            MostrandoCompra(carrinho)
            resposta = input("Deseja finalizar a compra? [S/N] ").lower()
            if resposta == "s":
                cep = input("Informe seu CEP: ")
                
                #Conclusão e despedida
                FinalizarCompra(cep)
            else:
                print("Compra cancelada.")
        break
    else:
        print("Resposta inválida!")
print("\033[1;33;44m Volte Sempre! \033[m")
