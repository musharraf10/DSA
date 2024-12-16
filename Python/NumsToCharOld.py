ones = ['', 'ONE', 'TWO', 'THREE', 'FOUR', 'FIVE', 'SIX', 'SEVEN', 'EIGHT', 'NINE',
       'TEN', 'ELEVEN', 'TWELVE', 'THIRTEEN',
       'FOURTEEN', 'FIFTEEN', 'SIXTEEN', 'SEVENTEEN', 'EIGHTEEN', 'NINTEEN']

tens= ['','','TWENTY', 'THIRTY', 'FOURTY', 'FIFTY', 'SIXTY', 'SEVENTY', 'EIGHTY', 'NINTY']

all = ['', '', 'HUNDRED', 'THOUSAND']

def num_to_words(num):
  if num == 0:
    s = 'ZERO'
  elif num < 20:
    s = ones[num]
  else:
    lst = [ord(ch)-48 for ch in str(num)]
    s = ''
    pv = len(lst) - 1
    for d in lst:
      if pv == 0:
        s += ' ' + ones[d]
      elif pv == 1:
        s += ' ' + tens[d]
      else:
        s += ' ' +  ones[d] + ' ' + all[pv]
  
      pv -= 1
  
    return s.strip()

print(num_to_words(2190))
print(num_to_words(190))
print(num_to_words(90))