test_num = int(input())
for i in range(test_num):
    case = list(input())
    for j in case[2:]:
        P = j*int(case[0])
        print(P, end='')
    print()