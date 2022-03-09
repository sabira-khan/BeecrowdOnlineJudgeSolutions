t = 1
while True:
    r, n = [int(x) for x in input().split()]
    if n == r == 0:
        break
    flag = 1
    if n >= r:
        print('Case %d: 0' % t)
    else:
        for j in range(1, 27):
            if n * (j + 1) >= r:
                print('Case %d: %d' % (t, j))
                flag = 0
                break
        if flag:
            print('Case %d: impossible' % t)
    t += 1
