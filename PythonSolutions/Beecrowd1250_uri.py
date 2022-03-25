n = int(input())

for i in range(n):

    s1 = int(input())
    s2 = input().split()
    s3 = input()
    s = 0
    k = 0
    l1 = []
    l2 = []
    for j in s2:
        j = int(j)
        l1.append(j)
    while k < len(s3):
        l2.append(s3[k])
        k += 1
    for x, y in enumerate(l2):
        if y == "J" and l1[x] > 2:
            s += 1
        elif y == "S" and 1 <= l1[x] <= 2:
            s += 1
        else:
            s = s
    print(s)
