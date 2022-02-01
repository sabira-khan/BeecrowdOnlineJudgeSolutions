from math import sqrt
while True:
    try:
        string = input().split()
        D = int(string[0])
        VF = int(string[1])
        vg = int(string[2])
        updated_vg = (sqrt(144 + (D * D))) / vg
        updated_vf = 12 / VF
        print('N' if updated_vg > updated_vf else 'S')
    except EOFError:
        break
