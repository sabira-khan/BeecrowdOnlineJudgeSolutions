n = int(input())
while n != 0:
    m = []
    i = 1
    while i ** 2 <= n:
        m.append(i ** 2)
        i += 1

    for i in range(len(m)):
        print('%d ' % m[i], end='') if i < len(m) - 1 else print(m[i])
    n = int(input())
