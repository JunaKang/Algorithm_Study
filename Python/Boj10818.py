# 방법 1
A = int(input())
N = list(map(int, input().split()))
print(min(N), max(N))

# 방법 2
A = int(input())
N = list(map(int, input().split()))
MAX = N[0]
MIN = N[0]
for i in N[1:]:
    if i > MAX:
        MAX = i

    if i < MIN:
        MIN = i
print(MIN, MAX)
