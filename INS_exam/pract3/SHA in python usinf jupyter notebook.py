#python code to implement SHA
import hashlib
str = input('Enter string to encode')

#Apply SHA1
result = hashlib.sha1(str.encode())

#convert it into hexadecimal value
result = result.hexdigest()

#Display Result
print('Output of SHA1',result)
