test = 1
while True:
    try:
        n = input()
        line = input().split()
        f = m = pairs = 0
        if test > 1:
            print()
        for i in range(0, len(line), 2):
            if line[i] == n:
                pairs += 1
                if line[i + 1] == 'M':
                    m += 1
                else:
                    f += 1
        res = 'Caso {}:\nPares Iguais: {}\nF: {}\nM: {}'
        print(res.format(test, pairs, f, m))
        test += 1

    except EOFError:
        break
