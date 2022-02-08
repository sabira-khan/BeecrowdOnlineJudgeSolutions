import math


def pythogorean(x, y, z):
    h = x
    temp1 = y
    temp2 = z
    if y > h and y > z:
        h = y
        temp1 = x
        temp2 = z
        return (h * h) == (temp1 * temp1) + (temp2 * temp2)
    elif z > h and z > y:
        h = z
        temp1 = y
        temp2 = x
        return (h * h) == (temp1 * temp1) + (temp2 * temp2)
    else:
        return (h * h) == (temp1 * temp1) + (temp2 * temp2)


while True:
    try:
        a, b, c = (input().split())
        a = int(a)
        b = int(b)
        c = int(c)
        pythogorean(a, b, c)
        math.gcd(a, b)
        if pythogorean(a, b, c) == True and math.gcd(math.gcd(a, b), c) == 1:
            print("tripla pitagorica primitiva")
        elif pythogorean(a, b, c):
            print("tripla pitagorica")
        else:
            print("tripla")
    except EOFError:
        break
