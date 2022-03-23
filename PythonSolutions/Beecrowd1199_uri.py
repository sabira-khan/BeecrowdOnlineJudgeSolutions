while True:
    n = str(input())
    if n.startswith('-'):
        break
    print(int(n, 16)) if 'j' in n else print(str(hex(int(n))).upper().replace('X', 'j'))
