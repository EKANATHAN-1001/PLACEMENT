a1 = []
a2 = [] 
print("Enter the size of array 1")
n = int(input())
for i in range(n):
    a1.append(int(input()))
print("Enter the size of array 2")
n = int(input())
for i in range(n):
    a2.append(int(input()))
a1.sort()
sorted(a2)
a1.extend(a2)
print(set(a1))

