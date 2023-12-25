X, Y, Z = map(int, input().split())
min_value = min(X, Y, Z)
max_value = max(X, Y, Z)
middle_value = X + Y + Z - min_value - max_value

print(f"{min_value}\n{middle_value}\n{max_value}")
print(f"\n{X}\n{Y}\n{Z}")

# proving a point that we can solve this without sort ;-P
