N = int(input())
for i in range(N):
    ox_list = list(input())
    score = 0
    sum_score = 0
    for j in ox_list[0:]:
        if j == "O":
            score += 1
            sum_score += score
        else:
            score = 0
    print(sum_score)
