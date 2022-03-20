n = int(input())
character = {'X': 0, 'H': 0, 'E': 0, 'A': 0, 'M': 0}

for i in range(n):
    r = input().split()[1]
    character[r] += 1

print("%d Hobbit(s)" % character['X'])
print("%d Humano(s)" % character['H'])
print("%d Elfo(s)" % character['E'])
print("%d Anao(s)" % character['A'])
print("%d Mago(s)" % character['M'])
