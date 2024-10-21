#python code to implement MD5
import hashlib

#provide Input and apply MD5
result = hashlib.md5(b'good')

#convert hash value into hexadecimal
result = result.digest()

#Display Result
print('Message Digest',result)
