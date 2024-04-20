input(("Bem vindo a calculadora do PP.\nNós diga seu nome: "))
def Soma(x,y):
    return (x+y)

def Subtração(x,y):
    return (x - y)

def Multiplicação(x,y):
    return (x*y)

def Divisão(x,y):
    if y == 0:
        return "Erro, divisão por 0!"
    else:
        return (x/y)

x = int(input("Digite um número: "))
y = int(input("Digite outro número:"))

escolha =int(input("Escolha: 1-adicão 2-subtração 3-Multiplicação 4-Divisão\n"))

if escolha == 1:
    print(Soma(x,y))   
elif escolha == 2:
    print(Subtração(x,y))
elif escolha == 3:
    print(Multiplicação(x,y))
elif escolha == 4:
    print(Divisão(x,y))

else:
    print("Erro, faça novamente!")