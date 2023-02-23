import os
path = "C://Users//moadz//OneDrive//Desktop"
dir_list = os.listdir(path)

emptystr = ""

# passing in a string 

for i in dir_list:

    emptystr += i +','

print(emptystr)





