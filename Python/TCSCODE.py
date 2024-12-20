# Accept input values
n1 = int(input())  # Speed of the 1st car per second
n2 = int(input())  # Speed of the 2nd car per second
X = int(input())   # Initial distance between the 1st and 2nd car

# Check if the 2nd car can catch up with the 1st car
if n2 <= n1:
    print(-1)
else:
    # Calculate the number of seconds after which the 2nd car will cross the 1st car
    seconds = (X + (n2 - n1) - 1) // (n2 - n1)  # This ensures we calculate the smallest number of seconds
    print(seconds)
