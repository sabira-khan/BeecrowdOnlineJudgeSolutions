while True:
    n, b = map(int, input().split())
    if n == 0 and b == 0:
        break
    q = [int(x) for x in input().split()]
    r = set()
    for i in range(b):
        for j in range(i + 1, b):
            r.add(abs(q[i] - q[j]))

    c = False
    for i in range(1, n + 1):
        if not i in r:
            print('N')
            c = True
            break
    if not c:
        print('Y')
