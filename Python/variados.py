
print("-----Média de notas Faesa------")

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

print("-----Custo da Gasolina------")

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
