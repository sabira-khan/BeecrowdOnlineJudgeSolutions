def nonFibonacci(n):
    last = 2
    current = 3
    while n > 0:
        prev_to_last = last
        last = current
        current = prev_to_last + last
        n = n - (current - last - 1)
    n = n + (current - last - 1)
    return last + n


s = int(input())
print(nonFibonacci(s))
