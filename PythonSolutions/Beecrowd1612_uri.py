import math
t = int(input())
while t > 0:
    n = int(input())
    print(n // 2 if n % 2 == 0 else int(math.ceil(n / 2)))
    t -= 1
