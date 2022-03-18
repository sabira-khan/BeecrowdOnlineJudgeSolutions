d = []
while True:
    try:
        input()
        d.append(float(input()))
    except:
        print(round(sum(d) / len(d), 1))
        break  # otherwise TLE
