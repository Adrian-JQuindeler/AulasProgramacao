print("CAIXA ELETRÔNICO ")
valor = int(input("Digite quanto deseja sacar: "))
cem = 0 
cinquenta = 0
vinte = 0
dez = 0
cinco = 0
dois = 0
print("")
if valor % 2 == 0:
    while True:
        if valor >= 100:
            valor -= 100
            cem +=1
        elif valor >= 50:
            valor -= 50
            cinquenta += 1
        elif valor >= 20:
            valor -= 20
            vinte += 1
        elif valor >= 10:
            valor -= 10
            dez += 1
        elif valor >= 2:
            valor -= 2
            dois += 1
        else:
            break
else:
    while True:
        if valor >= 100:
            valor -= 100
            cem +=1
        elif valor >= 50:
            valor -= 50
            cinquenta += 1
        elif valor >= 20:
            valor -= 20
            vinte += 1
        elif valor >= 5:
            valor -= 5
            cinco += 1
        elif valor >= 2:
            valor -= 2
            dois += 1
        elif valor == 0:
            break
        else:
            print(f"\n\tO valor {valor} não pode ser entregue")
            break
print(f"\nForam entregues: ")
print(f"\t{cem} notas de cem ")
print(f"\t{cinquenta} notas de cinquenta ")
print(f"\t{vinte} notas de vinte ")
print(f"\t{dez} notas de dez ")
print(f"\t{cinco} notas de cinco ")
print(f"\t{dois} notas de dois ")
