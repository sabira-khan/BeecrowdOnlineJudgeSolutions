while True:
    try:
        og_text = input().lower()
        num = input()
        line = input()
        sen = line.replace('<', '.<').replace('>', '>.').split('.')
        x = ""
        y = ""
        for w in sen:
            temp = w
            if temp != '':
                if temp[0] == '<':
                    x += temp.lower().replace(og_text, num)
                else:
                    x += temp
        a = line.split(' ')
        b = x.split(' ')
        for i in range(len(b)):
            if a[i].lower() == b[i]:
                y += a[i] + ' '
            else:
                y += b[i] + ' '

        print(y[0:len(y) - 1])
    except EOFError:
        break
