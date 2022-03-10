c = []
for i in range(32):
    c.append(i) if (i < 10) else c.append(chr(i + 55))
# don't do while (n!=0), read q carefully, otherwise you'll get 5 % error
while True:
    r = ''
    n = int(input())
    while n > 31:
        i = int(n % 32)
        r += str(c[i])
        n /= 32
    r += str(c[int(n)])
    r = r[::-1]
    print(r)
    if n == 0:
        break
