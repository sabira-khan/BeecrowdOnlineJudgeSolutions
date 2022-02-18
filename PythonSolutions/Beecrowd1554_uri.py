from math import sqrt

closest = 0
c = int(input())
while c:
    c -= 1
    n = int(input())
    xa, ya = [int(i) for i in input().split()]
    m = 999999999

    for j in range(n):
        xb, yb = [int(i) for i in input().split()]
        d = sqrt(abs(xa - xb) ** 2 + abs(ya - yb) ** 2)
        if d < m:
            m = d
            closest = j + 1
        n -= 1
    print(closest)
