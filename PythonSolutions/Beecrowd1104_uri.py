while True:
    x, y = input().split()
    if x == y == '0':
        break
    lx = [int(i) for i in input().split()]
    ly = [int(i) for i in input().split()]
    x = set(lx)
    y = z = set(ly)
    if len(x) < len(y):
        z, x = x, y
    z = [i for i in z if i not in x]
    print(len(z))
