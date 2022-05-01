while True:
    try:
        l = input().split(' ')
    except EOFError:
        break

    n = int(l[0])
    m = int(l[1])

    struc = {}

    l = input().split(' ')

    cont = 1
    for i in l:

        if int(i) in struc:
            struc[int(i)].append(cont)
        else:
            struc[int(i)] = [cont]
        cont += 1

    for i in range(m):
        l = input().split(' ')
        k = int(l[0])
        v = int(l[1])

        print(struc[v][k - 1] if v in struc and k <= len(struc[v]) else 0)
