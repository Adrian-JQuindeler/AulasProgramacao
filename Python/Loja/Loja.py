import Funções
#Criando a lista com os produtos vendidos
listaDeProdutos = [
    [1, "COOLER + PROCESSADOR + SSD", 999.99],
    [2, "PLACA-MÃE + MEMÓRIA RAM", 815.20],
    [3, "MEMÓRIA RAM 16GB", 314.25],
    [4, "PROCESSADOR", 729.99],
    [5, "MOUSE PAD", 34.46],
    [6, "PLACA-MÃE", 621.81],
    [7, "GABINETE", 135.46],
    [8, "MONITOR", 761.47],
    [9, "MOUSE", 115.50],
    [10, "COOLER", 55.99],
    [11, "FONTE", 98.25],
    [12, "SSD", 249.00]]

Especificações = ["Placa-Mãe Asus Prime A520M-E. ",
    "Processador Intel Core i9-13900K, 24-Core, 32-Threads, 3.0GHz (5.8GHz Turbo)",
    "SSD Kingston NV2 1TB NVMe M.2 2280",
    "Memória RAM 16gb",
    "Gabinete TGT G250, Lateral Acrilico, TGT-G250PR-01",
    "Cooler Master Cooler líquido de CPU MasterLiquid ML360 Illusion Close-Loop AIO",
    "Monitor Gamer Mancer Horizon Z PRO, 27 Pol. VA, FHD, 1ms, 165Hz, FreeSync, HDMI/DP",
    "Fonte Gamer GP650 80 Plus Bronze PFC Ativo Preta 650W, PRETO",
    "Mouse Gamer Sem Fio Logitech G703 LIGHTSPEED com RGB LIGHTSYNC, 6 Botões Programáveis",
    "Mouse pad para jogos RGB, 800 x 300 mm / 31,5 × 11,8 polegadas",
    "Cooler + Processador + SSD",
    "Placa-Mãe + Memória RAM"]

#Mostrando o nome da empresa
print("\033[1;33;44m===================================\033[m")
print("\033[1;33;44m     Adrian's & Adrian's LTDA.     \033[m")
print("\033[1;33;44m===================================\033[m")

carrinho = []

nome = input("Informe seu nome: ")
email = input("Seu email: ")
print(f"\nSeja bem vindo, {nome}")

Funções.MostrarProdutos(listaDeProdutos)
while True:
    while True:
        try:
            caminho = int(input("\nO que deseja fazer?"
                            "\n[1] Mostrar especificações dos produtos"
                            "\n[2] Adicionar item ao carrinho"
                            "\n[3] Remover item do carrinho"
                            "\n[4] Mostrar carrinho"
                            "\n[5] Finalizar compra"
                            "\nSua resposta: "))
            break
        except:
            print("Por favor, digite apenas números: ")
    if caminho == 1:
        #Mostrando especificações dos produtos
        Funções.MostrarEspecificações(Especificações)
        
    elif caminho == 2:
        #Colocando produtos no carrinho do cliente
        Funções.AdicionarItem(carrinho, listaDeProdutos)
    
    elif caminho == 3:
        #Removendo produtos no carrinho do cliente
        Funções.RemoverItem(carrinho)    

    elif caminho == 4:
        #Mostrando o carrinho do cliente
        Funções.MostrandoCompra(carrinho)
    
    elif caminho == 5:
        if len(carrinho) == 0:
            print("\n\033[1;33;44m Nenhum item foi selecionado. \033[m")
            break
        else:
            while True:
                #Terminando a venda
                Funções.MostrandoCompra(carrinho)
                resposta = input("Deseja finalizar a compra? [S/N] ").lower()
                if resposta == "s":
                    cep = input("Informe seu CEP: ")

                    #Conclusão e despedida
                    Funções.FinalizarCompra(cep, carrinho, nome, email)
                    break
                elif resposta == 'n':
                    print("Compra cancelada.")
                    break
                else:
                    print("Resposta inválida\n")
        break
    else:
        print("Resposta inválida!")
print("\033[1;33;44m Volte Sempre! \033[m")
