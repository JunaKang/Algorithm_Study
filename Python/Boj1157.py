word = input().upper()
special_word = list(set(word))
cnt_list = []
for i in special_word:
    cnt = word.count(i)
    cnt_list.append(cnt)
if cnt_list.count(max(cnt_list)) > 1:
    print("?")
else:
    max_index = cnt_list.index(max(cnt_list))
    print(special_word[max_index])