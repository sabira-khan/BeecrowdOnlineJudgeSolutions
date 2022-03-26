n = []
for i in range(20):
    n.append(int(input()))
n.reverse()
for i, j in enumerate(n):
    print('N[{}] = {}'.format(i, j))

