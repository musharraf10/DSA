def P1(n):
    for i in range(n):
        for j in range(n):
            if(j<=i):
                print("* ", end="")
            else:
                print(" ", end="")
        print("")

        # * 
        # * *
        # * * *
        # * * * *
#-----------------------------
def P2(n):
    for i in range(n+1):
        for j in range(n+1):
            if(i<=j):
                print("* ", end="")
            else:
                print("", end = "")
        print()
        # * * * * * 
        # * * * *
        # * * *
        # * *
        # *
# P2(5)
def P3(n):
    for i in range(1,n):
        for j in range(1,n):
            if i <= j:
                print("*", end=" ")
            else:
                print("", end = " ")
        print()

# P3(5)

#     *   *   *   *  
#       *   *   *
#         *   *  
#           *


def Feb(n):
    f =0
    s =1
    print(f,s, sep=' ' ,end=' ')
    for i in range(1,n+1):
        t = f+s
        f = s
        s = t
        print(t, end=" ")
# Feb(6)

def isPrime(n):
    for i in range(2,n):
        if n % i == 0:
            print("Not Prime")
            break
    else:
        print("Prime")

def lambdaFunc():
    res = lambda a : a**2
    print(res(6))

    res1 = lambda a : "Even" if a%2==0 else "Odd"
    print(res1(50))
# lambdaFunc()

def LamMAp():
    res = lambda a,b,c : str(a)+b+str(c)

    mapres = map(res,[1,2,3],['a', 'b', 'c'], [4,5,6])
    print(list(mapres))

LamMAp()

def filterLam():
    res = lambda a: a > 6

    fRes = filter(res, [1,7,8,3,2,7,9])
    print(list(fRes))
filterLam()

