e, d = input().split(" ")
e = int(e)
d = int(d)
if d - e >= 3:
    print("Muito bem! Apresenta antes do Natal!")
elif d - e < 0:
    print("Eu odeio x professora!")
elif d - e < 3:
    print("Parece o trabalho do meu filho!")
    d += 2
    print("TCC Apresentado!") if (d <= 24) else print("Fail! Entao eh nataaaaal!")
