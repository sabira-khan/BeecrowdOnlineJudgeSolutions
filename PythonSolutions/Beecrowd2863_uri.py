while True:
    try:
        n = int(input())
        temp = []
        for i in range(n):
            temp.append(float(input()))
        r = min(temp)
        print(r)
    except EOFError:
        break
