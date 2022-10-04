alphabet = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']
word = input()
sum = 0
for i in range(len(word)):
    for j in alphabet:
        if word[i] in j:
            sum += alphabet.index(j) + 3
print(sum)