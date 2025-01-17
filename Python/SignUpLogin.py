SignUpData = {}

def signUp(username, password, ph):
    if username not in SignUpData:
        SignUpData[username] = {"password":password, "ph": ph}
    else:
        raise Exception("User Already exits")
    


def Login(username, password):
    Inputpassword = SignUpData[username]['password']
    if username in SignUpData and password != Inputpassword :
        raise Exception("Credentials are not match")
    elif username not in SignUpData :
        raise Exception("User Not Found")
    else:
        print("Welcome to Home Page")


def UpdatePh(username , password, ph) :
    Inputpassword = SignUpData[username]['password']
    if username in SignUpData and Inputpassword == password:
        SignUpData[username]['ph'] = ph
    else:
        raise Exception(NameError)
    
signUp("mrf", 2, 91823)
signUp("mrf1", 1, 99196)
signUp("mrf2", 1, 94940)

Login("mrf", 2)

print("Before Modify : " , SignUpData['mrf2']['ph'])

UpdatePh("mrf2", 1, 91823)

print("After Modify : " , SignUpData['mrf2']['ph'])

print(SignUpData)