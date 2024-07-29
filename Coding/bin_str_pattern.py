str = input()
count = 0
k=0
for i in str:
    if i=='?':
        count = count+1
for i in range(2**count):
    str1 = bin(i)[2:].zfill(count)
    k=0
    for c in str:
        if c == '?':
            print(str1[k],end='')
            k = k+1
        else:
            print(c,end='')
    print()