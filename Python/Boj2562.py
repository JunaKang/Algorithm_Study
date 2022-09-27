import sys
a = list(int(input()) for _ in range(9))
MAX = a[0]
for i in a[1:]:
    if i > MAX:
        MAX = i
print(MAX)
print(a.index(MAX)+1)
