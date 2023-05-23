import Funções
#Criando a lista com os produtos vendidos
listaDeProdutos = [
    [1, "COOLER + PROCESSADOR + SSD", 999.99],
    [2, "PLACA-MÃE + MEMÓRIA RAM", 815.20],
    [3, "SSD", 249.00],
    [4, "MEMÓRIA RAM 16GB", 314.25],
    [5, "GABINETE", 135.46],
    [6, "COOLER", 55.99],
    [7, "MONITOR", 761.47],
    [8, "FONTE", 98.25],
    [9, "MOUSE", 115.50],
    [10, "MOUSE PAD", 22.13],
    [11, "PLACA-MÃE", 621.81],
    [12, "PROCESSADOR", 729.99]]

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
        Funções.MostrarProdutos(listaDeProdutos)
    
    elif caminho == 2:
        #Mostrando especificações dos produtos
        Funções.MostrarEspecificações(Especificações)
        
    elif caminho == 3:
        #Colocando produtos no carrinho do cliente
        Funções.AdicionarItem(carrinho, listaDeProdutos)
    
    elif caminho == 4:
        #Removendo produtos no carrinho do cliente
        Funções.RemoverItem(carrinho)    

    elif caminho == 5:
        #Mostrando o carrinho do cliente
        Funções.MostrarCarrinho(carrinho)
    
    elif caminho == 6:
        if len(carrinho) == 0:
            print("\n\033[1;33;44m Nenhum item foi selecionado. \033[m")
        else:
            #Terminando a venda
            Funções.MostrandoCompra(carrinho)
            resposta = input("Deseja finalizar a compra? [S/N] ").lower()
            if resposta == "s":
                cep = input("Informe seu CEP: ")
                
                #Conclusão e despedida
                Funções.FinalizarCompra(cep, carrinho, nome, email)
            else:
                print("Compra cancelada.")
        break
    else:
        print("Resposta inválida!")
print("\033[1;33;44m Volte Sempre! \033[m")
