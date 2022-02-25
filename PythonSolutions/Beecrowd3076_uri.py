import math

while True:
    try:
        n = int(input())
        print("%d" % math.ceil(n / 100))
    except EOFError:
        break
