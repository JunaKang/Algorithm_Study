Total = int(input())
N = int(input())
sum = 0
for i in range(N):
    A, B = map(int, input().split())
    sum += A*B
if sum == Total:
    print("Yes")
else:
    print("No")
