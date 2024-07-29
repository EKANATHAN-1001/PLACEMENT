n = int(input())
arr = []
count = 0
j =0
for i in range(n):
    arr.append(int(input()))
arr.sort()
print(arr)
for i in range(1,n):
    a = arr[j]+arr[i]
    print(str(a)+"="+str(arr[j])+"+"+str(arr[i]))
    print(i)
    if(a in arr):
        count = count+1
    if(i == n-1):
        print(i)
        i = j
        j = j+1
        print(j)
        print(i)
print(count)