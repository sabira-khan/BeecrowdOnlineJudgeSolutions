while True:
    try:
        n = int(input())
        p = c = 1
        while p % n != 0:
            p = (10 * p + 1) % n
            c += 1
        print(c)

    except EOFError:
        break

"""
p += 10 * t
t *= 10 works but will give TLE so be careful
"""