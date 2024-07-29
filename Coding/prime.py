a = int(input())
for i in range(2,int(a/2)+1):
    if(a%i == 0):
        print('Not prime')
        exit()
print("prime")
