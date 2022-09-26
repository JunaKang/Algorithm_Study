N = int(input())
num = N
Result = 0
while True:
    A = num // 10
    B = num % 10
    C = A + B
    num = B*10 + C % 10

    Result += 1
    if num == N:
        break
print(Result)


