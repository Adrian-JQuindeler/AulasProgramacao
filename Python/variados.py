print("\n\033[1m----------------------------------\033[m")
print("\033[1m---POSITIVO, NEGATIVO OU NEUTRO---\033[m")
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
print("\033[1m---ORÇAMENTO---\033[m")
print("\033[1m---------------\033[m\n")

salario = float(input("Informe seu salário: "))
gastos = float(input("Informe seu gasto com despesas: "))
if salario > gastos:
    print("Gastos dentro do orçamento")
elif salario < gastos:
    print("Orçamento estourado")
else:
    print("Salario zerado")

print("\n\033[1m-------------\033[m")
print("\033[1m---VOTAÇÃO---\033[m")
print("\033[1m-------------\033[m\n")

idade = int(input("Digite sua idade: "))
if idade >= 18 and idade < 65:
    print("Você é obrigado a votar")
    print("[13]")
    print("[22]")
elif idade < 16:
    print("Você não tem idade para votar!")
else:
    print("Você não é obrigado a votar")

print("\n\033[1m-------------\033[m")
print("-----Média de notas Faesa------")
print("\033[1m-------------\033[m\n")

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

print("\n\033[1m-------------\033[m")
print("-----Custo da Gasolina------")
print("\033[1m-------------\033[m\n")

# Rescebendo as notas e armazenando-as nas variaveis.
distancia = int(input("Quantos quilômetros são percorridos? "))
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

print("\n\033[1m-------------\033[m")
print("-----Conversor de temperatura------")
print("\033[1m-------------\033[m\n")

# Rescebendo o valor em fahrenheit
valor = int(input("Diga a temperatura em fahrenheit: "))

# Convertendo para Celcius
celcius = (valor - 32) * 5/9

# Mostrando o resultado
print(f"{valor}°F convertido em celcius é: {celcius:.2f}°C")
