a = int(input())
a = str(bin(a))[2:]
b = ''
for i in a:
    if i == '0':
        b = b+'1'
    else:
        b = b+'0'
rev_int = int(b,2)
print(rev_int)