N = int(input())
T = list(map(int, input().split()))
result = 0
for i in T[0:]:
        i = i/max(T)*100
        result += i
print(result/N)