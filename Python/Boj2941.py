
word = input()
cnt = len(word)
croatia = ['c=','c-','d-','lj','nj','s=','z=','dz=']
for i in croatia:
    if i in word:
        cnt -= 1
print(cnt)

//미완성