
#################################################################
# 1] Write a statement(WAS) to print “Hello World” by using shell
# printHello = 'Hello World'
# >printHello
# ---------------------------

# 2] WAS to print “Hello world” by using python print function
# print('Hello World')
#----------------------------

# 3] WAS to initialize variable and value as 50.
# variable = 50
#----------------------------

#4] WAS to initialize multivariable (values are 150,120,250)(Take your own variable names )
# var1 = 150
# var2 = 120
# var3 = 250
# ---------------------------

#5] WAS to print the type of the data in given value.
# var = 'DATATYPE'
# print(type(var))
# ---------------------------

#6] WAS to print the address of the memory block in given value.
# var = 10
# print(id(var))
# ---------------------------

#7] WAS to print your details, first store your details, extract the values and display it.
# name='your Name'
# age = 'Your Age'
# role = 'Devloper'
# company = 'ABC'
# print(f'My name is {name} and my age is {age} my role was {role} in {company}')
# --------------------------

#8] WAS to swap the two values. With temp variable.
# a=30
# b=20
# temp = b
# b = a
# a = temp
# print(a,b)
# ------------------------

#9] WAS to swap the two values without temp variable
# a=10
# b=20
# a,b= b,a
# print(a,b)
# (OR)
# a= a+b
# b=a-b
# a=a-b
# print(a,b)
# -------------------------

#10]WAS to initialize a value and print the value, after print the value,
# then reinitialize the new value to the existing variable and display the value.

# var = 10
# print('Initial Value ',var)
# var = 55
# print('Reassined Value ',var)
#---------------------------

#11] WAS to convert single to multi value data type
# I/p ⇒ a=10
# o/p ⇒ [‘1’,’0’]

# a=10
# print(list(str(a)))
#Both are same
# numToStr=str(a)
# strToList=list(numToStr)
# print(strToList)
# -----------------------------

#12] WAS to concat the two multi value data types(str , list, tuple, set, dict).
# str1 = "Hello"
# str2 = "World"
# result = str1 + " " + str2
# print(result)
#
# l1 = [1, 2, 3]
# l2 = [4, 5, 6]
# result = l1 + l2
# print(result)
#
# t1 = (1, 2, 3)
# t2 = (4, 5, 6)
# result = t1 + t2
# print(result)
#
# set1 = {1, 2, 3}
# set2 = {4, 5, 6}
# result = set1 | set2  # this also or set1.union(set2)
# print(result)
#
# dict1 = {'a': 1, 'b': 2}
# dict2 = {'c': 3, 'd': 4}
# result = {**dict1, **dict2}
# print(result)
# ------------------------------

# 13] WAE to perfrom the length of the collection
# collection datatypes list, tuple , string , dict
# d={'a':10,'b':20}
# s='StringLength'
# l=[1,2,3,4,[5,7]]
# t=(1,2,3,4,5)
# print(len(d))
# print(len(s))
# print(len(l))
# print(len(t))

#----------------------------------

# 14] WAE to modify the middile value of the given collection

# l=[1,2,3,4,5]
# print(f'Before Modify is {l} ')
# m=int(len(l)/2)
# l[m]= input('
# print(f'After modifying middle element {l}')

# ---------------------------------

# 15] WAS to concat the new string into the starting of the given string.

# initailStr = 'World'
# newStr='Hello'
# print(newStr+' '+initailStr)

# 16] WAS to concat the new string into the ending of the given string.

# initailStr = 'World'
# endStr='Hello'
# print(initailStr+' '+endStr)

# 17] WAS to concat the new string into the middle of the given string.

# start='Hi Morning'
# middle='Good'
# newStr = start[:2:] +' '+ middle + start[2::]
# print(newStr)
#--------------------------

#18]WAS to modify the new character into the middle of the given string.
# newStr="Hi Good Morning"
# m=int(len(newStr)/2)
# start = newStr[:m:]
# end=newStr[m::]
# newOne = start + " hello "+end
# print(newOne)
#---------------------------

#19] WAS to modify the sequence of characters In given string.
# strr = 'Heelo World'
# print(strr[::-1])

#-------------------------------

#20]WAS to replace the old character into a new character of the given string.
# strr='Hello World'
# newStr= strr.replace('o','@')
# print(newStr)

#-------------------------------
#21] WAS to delete the specific character in the given string.

# strr='Hello World'
# newStr= strr.replace('o','')
# print(newStr)

#-----------------------------------

#22] WAS to delete the sequence of  characters in the given string.

# strr='Hello World'
# newStr= strr.replace('lo','')
# print(newStr)

#----------------------------------\

#23]WAS to concat the new string into the specific position of the given string.
# strr= 'Hello World '
# position=5
# newStr = strr[:position:]+ " Positional String "+strr[6::]
# print(newStr)

#-------------------------------------

#24]WAS to concat the new value into the starting of the given list.
# l=[2,3,4,5]
# print([1]+l)

#--------------------------------------

#25] WAS to concat the new value into the ending of the given list.

# l=[1,2,3,4]
# print(l+[5,6,7])

#--------------------------------------

#26] WAS to concat the new value into the middle of the given list.

# l=[1,2,3,4,5]
# m=int(len(l)/2)
# print(l[:m]+ ['New','List']+l[m::])
#--------------------------------

#27]WAS to concat the new value into the specific position of the given list.

# l=['Hello','World','Fall','Joom']
# position=2
# print(l[:position]+['New']+l[position::])
#--------------------------------

#28]WAS to modify the new value into the specific position of the given list.

#29] WAS to modify the new value into the starting of the given list.
# l=[1,2,3]
# print([-1,0]+l)
#--------------------------------

#30] WAS to modify the new value into the ending of the given list.
# l=[1,2,3,4]
# print(l+[5,6])

#------------------------------
#31]WAS to modify the new value into the middle of the given  list.

# l=[1,2,334,4,449]
# print(l[0:2]+['Hello']+l[2::])
#-------------------------------
#32]WAS to modify the starting 4 positions values into a given list.
# l=[1,2,3,4,5,6,7,8]
# four=[10,20,30,40]
# l[:4]=four
# print(l)
#-------------------------------
#33] WAS to modify the sequence of values into a given list.

# l=[1,2,3,4,5,6]
# newSeq=[10,20]
# l[2:4]=newSeq
# print(l)

#----------------------------------

#34]WAS to delete the value in the specific position of the given list.
# l=[1,2,3,4,5]
# pos=2
# print(l[:pos:]+l[pos+1:])

#------------------------------------

#35]WAS to delete the value in the specific position of the given list.

# l=[1,2,3,4,5,6]
# print(l[:len(l)-1:])

#--------------------------------
#36]WAS to delete the value into the starting of the list.
# l=[1,2,3,4,5]
# print(l[1::])

#-------------------------------------------
#37 WAS to delete the value into the middle of the list.

# l=[1,2,3,4,5]
# m=int(len(l)/2)
# del l[m]
# print(l)

#--------------------------
#38]WAS to concat the value into starting of the tuple.

# t= (1,2,3,4)
# t1=(-1,0)
# print((t1+t))

#-------------
#39]WAS to concat the value into the middle of the tuple.
# t= (1,2,3,4)
# m=(len(t)//2)
# print(t[:m]+ ('Added','Tuple') + t[m::])
#-----------------------

#40]WAS to concat the value into the ending of the tuple.
# t=(1,2,3,4)
# t1=(5,6)
# print(t+t1)

#41]WAS to modify the sequence of values in given tuple.

# t=(1,2,3,4,5,6)
# sequenc = t[4::-1]+t[4::]
# print(sequenc)

#42]WAS to delete the sequence of values in given tuple.
# t=(1,2,3,4,5,6)
# sequenc = t[:3:]+t[5:]
# print(sequenc)

#------------------------
#43]WAS to concat the new value into the set.
# s={1,2,3}
# s= s|{4,5,6,6}
# print(s)

#44]WAS to delete the specific value into the set.

# s={1,2,3,4}
# s-={3}
# print(s)

#45]WAS to concat the new key and value into the dict.
# d={'a':10,'b':20}
# d= d|{'c':30}
# print(d)

#46] 46.WAS to delete the specific key and value in the given dict.
# d={'a':10,'b':20,'c':30}
# d.pop('a')
# print(d)

#47]WAS to modify the specific value in the given dict.
# d = {'a': 10, 'b': 20, 'c': 30}
# d['a']='Value'
# print(d)

#48]WAS to concat the list and tuple values by using type casting.
# t=(1,2,3)
# l=[4,5,6]
# print(list(t)+l)

#49]WAS to concat the list value and tuple value without using type casting.
# t=(1,2,3)
# l=[4,5,6]
# combo =[*t,*l]
# print(combo)

#50]WAE to check the given number is divisible by 3.
# n=int(input('Enter a Number :'))
# l=[False,True][n%3==0]
# print(l)
# 51.WAE to check the given number is divisible by 2 and 6.
# n=int(input("enter a number:"))
# res = ["false","true"][n%2 == 0 and n%6==0]
# print(res)

# 51.WAE to check the given number is divisible by 2 and 6.
# n=int(input("enter a number:"))
# res = ["false","true"][n%2 == 0 and n%6==0]
# print(res)

## 52. WAE to extract the last digit in given integer number. (without typecasting)
# n = int(input("enter a number:"))
# res = n%10
# print(res)

##53.WAE to check the last digit is divisible by 3 from given integer number. (without typecasting)
# n = int(input("enter a number:"))
# last_digit = n%10;
# res = ["false", "true"][last_digit % 3 == 0]
# print(res)

##54.WAE to check the last digit is divisible by 3 from given integer number. (with typecasting)
# n = int(input("enter a number:"))
# str_num= str(n)
# res = ["false","true"][int(str_num[-1]) % 3 == 0]
# print(res)

##55 WAE to check the given number is greater than 150.
# n = int(input("enter a number:"))
# print(("false", "true")[n>150])

##56. WAE to check the given number is greater than or equal to 100.
# n = int(input("enter a number:"))
# print(("false","true")[n>=100])

##57. 57.  WAE to check the given number is less than 150, print the result.
# n = int(input("enter a number:"))
# print(("false","true")[n<150])


##58. 58. WAE to check the given number is less than or equal to 100.

# n = int(input("enter a number:"))
# print(("false", "true")[n<=100])

##59.WAE to check the given number is greater than 15 & less than 24

# n = int(input("enter a number:"))
# print(("false", "true")[n>15 and n<24])

##60.WAE to check the given number is even.

# n = int(input("enter a number:"))
# print(('false',"true")[n%2 ==0])

##61.WAE to check the given number is odd.

# n = int(input("enter a number:"))
# print(("false","true")[n%2==1])

##62.WAE to check perform the replication of a given string with 6.
# string = input("enter a string:")
# print(string * 5)

##63.WAE to check the given number is divisible by 3 and also the number should be greater than 22.
# n = int(input("enter a number:"))
# print(["false","true"][n%3 ==0 and n>22])

##64.WAE to check perform the length of the collection is even or not.
# string = input("enter a string:")
# print(["length is odd","length is even"][len(string) % 2 ==0])

##65.WAE to check perform  the length of the collection is less than 55 and greater than 16.

# string = input("enter a string:")
# print(["false","true"][len(string)>15 and len(string)<55])

##66.WAE to check perform  the length of the collection is divisible by 5 and odd.
# collection = input("enter any collection:")
# print(["false","true"][len(collection) % 5 ==0 and len(collection) %2 ==1])

##67.WAE to check extract the middle position of a given collection is either str, list, tuple)

# t = [1,2,3,4,5,6,7,8,9]
# string = "hello_guys "
# print(string[len(string)//2])
# print(t[len(t)//2])


##68.WAE to check the given number is greater than 20 and less than 30 and it should be even.

# n = int(input("enter a number:"))
# print(("false","true")[n > 20 and n<30 and n %2 ==0])

##69.WAE to check the given number is even and it should be less than 120.
# n = int(input("enter a number:"))
# print(("false","true")[n%2 ==0 and n<120])

##70.WAE to check the given number is even and present from 40 to 70
# n = int(input("enter a number between 4o and 70:"))
# print(("false","true")[n%2==0 and n>40 and n<70])

##71.WAE to check the given number is odd and it should be greater than 97.
# n = int(input("ente a number:"))
# print(("false","true")[n%2==1 and n>97])

##72.WAE to check the given number is less than 122 and greater than 48 and the number should be divisible by 4.
# n = int(input("enter a number:"))
# print(("false","true")[n>48 and n<122 and n%4==0])

##73.WAE to check the given number is divisible by 3 or 5, displaying the value.
# n = int(inut("enter a number:"))
# print(("false","true")[n%3==0 or n%5==0])

##74.WAE to check the given number is between 100 to 200 including the limit.
# n = int(input("enter a number:"))
# print(("false","true")[n>=100 and n<=200])

##75.WAE to check the given number is in between 100 to 200.
# n = int(input("enter a number:"))
# print(("false","true")[n>100 and n<200])

##76.n = int(input("enter a number:"))
# print(("false","true")[n>=100 and n<=200])

##77.WAE to check the given number is present between 60 to 130 and the number should be divisible by 3 and 4 and the last digit should be less than 9.
# n = int(input("enter a number:"))
# print(("false","true")[(n>60 and n<130) and(n%3==0 and n%4==0) and n%10 < 9 ])

##78.WAE to check the given number is even or less than 25.

# n = int(input("enter a number:"))
# print(("false","true")[n%2==0 or n<25])

###79.WAE to check the given number is even or greater than 25.

# n = int(input("enter a number:"))
# print(("false","true")[n%2==0 or n>25])

##80.WAE to check the given number is divisible by either 3 or 5.
# n = int(input("enter a number:"))
# print(("false","true")[n%3==0 or n%5==0])

##81.WAE to check the given number is not an even number.

# n = int(input("enter a number:"))
# print(("false","true")[n%2!=0])

##82.WAE to check the given number is not an odd number

# n = int(input("enter a number:"))
# print(("false","true")[n%2!=1])

##83.WAE to check the given number is not a divisible by 3

# n = int(input("enter a number:"))
# print(("false","true")[n%3!=0])

##84.WAE to check the given number is not a divisible by 3 and  5
# n = int(input("enter a number:"))
# print(("false","true")[n%3!=0 and n%5!=0])

##85.WAE to check the given number is not a divisible by 3 or 5

# n = int(input("enter a number:"))
# print(("false","true")[n%3!=0 orn%5!=0])

##86.86.WAE to check the given character ascii value is not divisible by 5.
# char= input("enter a char:")
#print(("false","true"),[ord(char)%5==0])

##87.WAE to check find out the ascii character in a given number.

# n = int(input("Enter a number: "))
# ascii_char = chr(n)
# print(f"The ASCII character for {n} is '{ascii_char}'")

##88.WAE to check find out the ascii value in a given character.

# char = input("Enter a character: ")
# ascii_value = ord(char)
# print(f"The ASCII value for '{char}' is {ascii_value}")

##89.WAE to check the given character is uppercase or not.
##with using the built in method
# char = input("enter a character:")
# # print(char.isupper())

##without builtin method
# if("a"<=char<="z"):
#     print("false")
# else:
#     print("true")

##90.WAE to check the given character is lowercase or not.
# char = input("enter a character:")
# # print(char.islower())

##without builtin method
# if("A"<=char<="Z"):
#     print("false")
# else:
#     print("true")

##91.WAE to check the given character is the alphabet.
# char = input("enter a character:")
##with using built in method
# print(char.isalpha())
##with out using built in method
# if not ("a"<=char<="z" or "A"<=char<="Z"):# if not ("65"<=char<="90" or "97"<=char<="122")
#     print("false")
# else:
#     print("true")


##92.WAE to check the given character is the ascii number.
# n = input("enter a number:")
# if ("0"<=n<="9"):
#     print("true")
# else:
#     print('false')

##93. WAE to check the given character is the special character.

# char = input('enter a character:')
# if not ('0' <= char <= '9' or 'A' <= char <= 'Z' or 'a' <= char <= 'z'):
#     print("true")
# else:
#     print("false")

##94.WAE to check the given character should not be uppercase.
#with using built in method
# char = input("enter a character:")
# print(char.lower())
# #with out using built in method
# if ("A"<=char<="Z"):
#     print(chr(ord(char)+32))
# else:
#     print(char)

##95. WAE to check the given character should not be lowercase.
#with using built in method
# char = input("enter a character:")
#print(char.upper())
#with out using built in method
# if ("a"<=char<="z"):
#     print(chr(ord(char)-32))
# else:
#     print(char)

##96.WAE to check the given character should not be the alphabet.
# n = input("enter a number:")
# if not('0'<=n<='9'):
#     print("false")
# else:
#     print("true")

##97.WAE to check the given character should not be an ascii number. A = 7
# n = input("enter a number:")
# if ('0'<=n<='9'):
#     print("false")
# else:
#     print("true")

##98.WAE to check the given character should not be a special character.
# char = input("enter a character:")
# if ('0' <= char <= '9' or 'A' <= char <= 'Z' or 'a' <= char <= 'z'):
#     print("true")
# else:
#     print("false")

##99.WAE to check the given character is a vowel.
# char = input("enter a character:")
# if char in "aeiouAEIOU":
#     print("true")
# else:
#     print("false")
#


##100.WAE to check the given character is a vowel.

# char = input("enter a character:")
# if char not in "aeiouAEIOU":
#     print("true")
# else:
#     print("false")

#101]WAS to convert uppercase to lowercase in a given character.
# upper=''
# n=input('Enter a String : ')
# for char in n:
#     if 'A'<=char<='Z':
#         upper+=chr((ord(char)+32))
#     else:
#         upper+=char
# print(upper)

# print(n.lower())

#102]WAS to convert lowercase to uppercase in a given character.
# lower=''
# n=input('Enter a String : ')
# for char in n:
#     if 'a'<=char<='z':
#         lower+=chr((ord(char)-32))
#     else:
#         lower+=char
# print(lower)
# print(n.upper())

#103]WAS to extract the previous character in the given character.
# char='A'
# char_code = ord(char)
# prev_char_code = char_code - 1
# if char == 'a':
#      prev_char_code = ord('z')
# elif char == 'A':
#      prev_char_code = ord('Z')
# res=chr(prev_char_code)
# print(res)

#104]WAS to extract the next character in the given character.
# char='A'
# charCode = ord(char)
# prev = charCode + 1
# if char == 'z':
#      prev = ord('a')
# elif char == 'Z':
#      prev = ord('A')
# res=chr(prev)
# print(res)

#105]WAE to check the given character is converted to ASCII value # and the value is even as well as the character should be lowercase.
# isTrue=False
# n=input('Enter a Charecter :')
# if not n.islower():
#     isTrue=False
# acscii_val=ord(n)
# if acscii_val%2==0:
#     isTrue=True
# else:
#     isTrue=False
# print(isTrue)

#106]WAE to check the given character is converted to ASCII value and the value is odd as well as the character should be uppercase.
# char = 'C'
# isUpper = char.isupper()
# asciiValue = ord(char)
# isTrue = asciiValue % 2 != 0
# res=False
# if isUpper and isTrue:
#     res=True
# else:
#     res=False
# print(res)

#107]WAE to check which the given number is converted to character , and is a special symbol or not.
# n=23
# char=chr(n)
# if char.isalnum():
#     print('Not a Special symbol',chr(n))
# else:
#     print(' Special symbol', chr(n))

#108]WAE to check the given number of the ascii character is a vowel or not.
# n=65
# char=chr(n)
# if char in ('aeiouAEIOU'):
#     print('Given number is Vowel')
# else:
#     print('Not a vowel')

#109]WAE to check if the first and second characters are sequence or not in a given string.
# inputStr='abcdvkjvbk'
# seq=ord(inputStr[0])==ord(inputStr[1])-1
# print(seq)

#110]WAE to check the given  character ASCII value should be either greater than 50 or greater than 25 or less than 112.
# char='d'
# num=ord(char)
# if 25<=num<=112:
#     print('Given Char is present 25 to 112 : ',ord(char))
# else:
#     print('Not Present')

#111]WAE to given number should increase by 1.
# num=10
# print(num+1)
#
#112]WAE to given number should increase by 2.
# num=10
# print(num+2)
