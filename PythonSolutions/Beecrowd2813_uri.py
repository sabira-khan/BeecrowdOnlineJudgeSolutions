n = int(input())
c = e = tc = te = 0

for g in range(n):
    sd, sn = input().split()

    if sn == 'chuva':
        if e > 0:
            e -= 1
            c += 1
        else:
            te += 1
            c += 1

    if sd == 'chuva':
        if c > 0:
            c -= 1
            e += 1
        else:
            tc += 1
            e += 1

print(tc, te)
