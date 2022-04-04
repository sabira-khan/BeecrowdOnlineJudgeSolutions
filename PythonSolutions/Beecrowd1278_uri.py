case = False
while True:
    test = int(input())
    if test == 0:
        break
    if case:
        print()

    s = []
    for i in range(test):
        s.append(' '.join(input().split()))
    l = max(len(i) for i in s)

    for i in range(len(s)):
        for j in range(l - len(s[i])):
            print('', end=' ')
        print(s[i])

    case = True
