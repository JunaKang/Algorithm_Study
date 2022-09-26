N, X = map(int, input().split())
C = list(map(int, input().split()))
for i in range(N):
    if C[i] < X:
        print(C[i], end=' ')
