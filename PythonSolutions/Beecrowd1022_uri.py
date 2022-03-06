def gcd(n, m):
    return n if m == 0 else gcd(m, n % m)


t = int(input())
while t:

    numerator1, d1, denominator1, s, numerator2, d2, denominator2 = input().split()
    numerator1, denominator1, numerator2, denominator2 = int(numerator1), int(denominator1), int(numerator2), int(denominator2)

    if s == '+':
        r1 = (numerator1 * denominator2 + numerator2 * denominator1)
        r2 = (denominator1 * denominator2)
    elif s == '-':
        r1 = (numerator1 * denominator2 - numerator2 * denominator1)
        r2 = (denominator1 * denominator2)
    elif s == '*':
        r1 = (numerator1 * numerator2)
        r2 = (denominator1 * denominator2)
    elif s == '/':
        r1 = (numerator1 * denominator2)
        r2 = (numerator2 * denominator1)
    print('%d/%d = %d/%d' % (r1, r2, r1 / gcd(r1, r2), r2 / gcd(r1, r2)))
    t -= 1
