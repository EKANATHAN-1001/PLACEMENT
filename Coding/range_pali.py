min = int(input())
max = int(input())
for i in range(min,max+1):
    a = str(i)
    if(a==a[::-1]):
        print(a)