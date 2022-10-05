# 도대체 왜 안될까 ,,? 맞은거 아니야 ? ,, ㅠㅠ
T = int(input())
for i in range(T):
    case = list(map(int, input().split()))
    M = sum(case[1:])/case[0]
    num = 0
    for j in case:
        if M < j:
            num += 1
    print("{:.3f}%".format(num/case[0]*100))
