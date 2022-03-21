while True:
    try:
        t = input().split('/')
        print('%s/%s/%s' % (t[1], t[0], t[2]))
        print('%s/%s/%s' % (t[2], t[1], t[0]))
        print('%s-%s-%s' % (t[0], t[1], t[2]))

    except EOFError:
        break
