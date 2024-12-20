# Accept the input sentence
sentence = input()  # Read the input sentence

# Create a set to store all the letters of the alphabet
all_letters = set('abcdefghijklmnopqrstuvwxyz')

# Traverse the input string and remove found letters from the set
for ch in sentence.lower():
    if ch.isalpha():
        all_letters.discard(ch)

# If the set is empty, it means all letters are present, otherwise print missing letters
if not all_letters:
    print(0)  # No missing letters, print 0
else:
    print(''.join(sorted(all_letters)))  # Print missing letters in alphabetical order
