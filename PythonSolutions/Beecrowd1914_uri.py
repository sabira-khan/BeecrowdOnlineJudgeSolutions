for i in range(int(input())):
    p1, c1, p2, c2 = input().split()

    s = sum([int(j) for j in input().split()])
    if s % 2 == 0:
        print(p1) if c1 == 'PAR' else print(p2)
    else:
        print(p1) if c1 == 'IMPAR' else print(p2)
