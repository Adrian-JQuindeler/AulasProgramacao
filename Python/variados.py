print("\033[1m---------------\033[m")
print("\033[1mURNA ELETRÔNICA\033[m")
print("\033[1m---------------\033[m\n")
votosThomas = 0
votosJacinto = 0
votosMia = 0
votosChu= 0
horario = 0
while True:
    horario = int(input("Digite a hora: "))
    if horario > 18:
        break
    print("\nCandidatos: \n[13] Thomas Turbando \n[22] Jacinto Pinto Aquino Rego \n[44] Mia Regaça \n[12] Chu Passeios")
    resposta = int(input("Seu voto: "))
    if resposta == 13:
        confirmar = input("Confirmar voto para 'Thomas Turbando'? [S/N]").upper()
        if confirmar[0] == "S":
            print("\n--------------------------------------")
            print("Voto confirmado para 'Thomas Turbando'")
            print("--------------------------------------")
            votosThomas += 1
        else:
            print("Voto cancelado")
    elif resposta == 22:
        confirmar = input("Confirmar voto para 'Jacinto Pinto'? [S/N]").upper()
        if confirmar[0] == "S":
            print("\n------------------------------------")
            print("Voto confirmado para 'Jacinto Pinto'")
            print("------------------------------------")
            votosJacinto += 1
        else:
            print("Voto cancelado")
    elif resposta == 44:
        confirmar = input("Confirmar voto para 'Mia Regaça'? [S/N]").upper()
        if confirmar[0] == "S":
            print("\n---------------------------------")
            print("Voto confirmado para 'Mia Regaça'")
            print("---------------------------------")
            votosMia += 1
        else:
            print("Voto cancelado")
    elif resposta == 12:
        confirmar = input("Confirmar voto para 'Chu Passeios'? [S/N]").upper()
        if confirmar[0] == "S":
            print("\n-----------------------------------")
            print("Voto confirmado para 'Chu passeios'")
            print("-----------------------------------")
            votosChu += 1
        else:
            print("Voto cancelado")
    else:
        print("\n-------------")
        print("Voto Inválido")
        print("-------------")

print("\n-----------")
print("RESULTADOS: ")
print("-----------")
print("Thomas Turbando = ", votosThomas)
print("Jacinto Pinto Aquino Rego = ", votosJacinto)
print("Mia Regaça = ", votosMia)
print("Chu Passeios = ", votosChu)

print("\n\033[1m----------------------------------\033[m")
print("\033[1m   POSITIVO, NEGATIVO OU NEUTRO   \033[m")
print("\033[1m----------------------------------\033[m\n")

num = float(input("Digite o número: "))
print("Analizando... ")
if num > 0:
    print(f"O número {num} é positivo")
elif num < 0:
    print(f"O número {num} é negativo")
else:
    print(f"0 é neutro")

print("\n\033[1m---------------\033[m")
print("\033[1m   ORÇAMENTO   \033[m")
print("\033[1m---------------\033[m\n")

salario = float(input("Informe seu salário: "))
gastos = float(input("Informe seu gasto com despesas: "))
if salario > gastos:
    print(f"Gastos dentro do orçamento, sobram R$ {salario - gastos}")
elif salario < gastos:
    print("Orçamento estourado")
else:
    print("Salario zerado")

print("\n\033[1m--------------------------------\033[m")
print("\033[1m     MÉDIA DE NOTAS FAESA     ")
print("\033[1m--------------------------------\033[m\n")

# Rescebendo as notas e armazenando nas variaveis c1, c2 e c3.
c1 = float(input("Primeira nota: "))
c2 = float(input("Segunda nota: "))
c3 = float(input("Terceira nota: "))

# Calculando a média das 3 notas.
media = (c1 + c2 + c3) / 3

# Primeiro teste de aprovação.
if media >= 7:
    print("Você foi aprovado, logo boas férias")
else:
    # Calculo de quanta nota falta para atingir a média.
    precisa = 5 - media * 0.6
    print(f"reprovado, você precisa de {precisa/0.4:.1f} pontos para passar")
    final = float(input("Nota final: "))

    # Calculo do resultado final.
    resultado = final * 0.4 + media * 0.6
    print(resultado)

    # Teste para prova final.
    if resultado >= 5:
        print("Você foi aprovado, logo, boas férias")
    else:
        print("REPROVADO!!!")

print("\n\033[1m-----------------------------\033[m")
print("\033[1m      CUSTO DA GASOLINA      ")
print("\033[1m-----------------------------\033[m\n")

# Rescebendo as notas e armazenando-as nas variaveis.
distancia = int(input("Quantos quilômetros são percorridos no percurso? "))
velocidade = int(input("Qual a velocidade média (Em km/h)? "))
consumo = int(input("Qual a média de quilômetros percorridos por litro? "))
preco = float(input("Qual o preço do litro de gasolina? "))

# Calculando o gasto e preço da gasolina
gasto = distancia / consumo
valor = gasto * preco

# Calculando o tempo gasto no percurso
velocidade = velocidade / 3.6
distancia *= 1000
tempo = distancia / velocidade

# Mostrando o resultado
print(f"\nVocê irá demorar {(tempo/60)/60:.2f} horas no percurso")
print(f"gastará {gasto:.1f} litros de gasolina")
print(f"e o preço será de R$ {valor:.3f}")

print("\n\033[1m------------------------------------\033[m")
print("      CONVERSOR DE TEMPERATURA      ")
print("\033[1m------------------------------------\033[m\n")

# Rescebendo o valor em fahrenheit
valor = int(input("Diga a temperatura em fahrenheit: "))

# Convertendo para Celcius
celcius = (valor - 32) * 5/9

# Mostrando o resultado
print(f"{valor}°F convertido em celcius é: {celcius:.2f}°C")
