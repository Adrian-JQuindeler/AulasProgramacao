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
    
    print("-----Média de notas Faesa------")
c1 = float(input("Primeira nota: "))
c2 = float(input("Segunda nota: "))
c3 = float(input("Terceira nota: "))
media = (c1 + c2 + c3) / 3
if media >= 7:
    print("Você foi aprovado, logo boas férias")
else:
    precisa = media * 0.6
    print(f"reprovado, você precisa de {precisa} pontos para passar")
    final = float(input("Nota final: "))
    resultado = final * 0.4 + media * 0.6
    print(resultado)
    if resultado > 5:
        print("Você foi aprovado, logo, boas férias")
    else:
        print("REPROVADO!!!")

