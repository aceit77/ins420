import hashlib
result=hashlib.md5(b'good')
result1=hashlib.md5(b'mrng')

print("The byte equivalent of hash is: ",end="")
print(result.digest())
print("The byte equivalent of hash is:", end="")
print(result1.digest())
