t = int(input())
while t > 0:
    n = int(input())
    arr = input().split()
    for i, j in enumerate(arr):
        arr[i] = int(arr[i])
    rev = sorted(arr)
    rev.reverse()
    count = 0
    for i, j in enumerate(arr):
        if arr[i] == rev[i]:
            count += 1
    print(count)
    t -= 1