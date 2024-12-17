ones = ['', 'ONE', 'TWO', 'THREE', 'FOUR', 'FIVE', 'SIX', 'SEVEN', 'EIGHT', 'NINE',
        'TEN', 'ELEVEN', 'TWELVE', 'THIRTEEN', 'FOURTEEN', 'FIFTEEN', 'SIXTEEN',
        'SEVENTEEN', 'EIGHTEEN', 'NINETEEN']

tens = ['', '', 'TWENTY', 'THIRTY', 'FORTY', 'FIFTY', 'SIXTY', 'SEVENTY', 'EIGHTY', 'NINETY']

place_values = ['', 'THOUSAND', 'MILLION', 'BILLION', 'TRILLION']  # Supports large numbers

def num_to_words(num):
    if num == 0:
        return 'ZERO'

    result = []
    lst = [int(ch) for ch in str(num)]  # Convert number to list of digits
    pv = len(lst) - 1  # Place value index (e.g., units, tens, hundreds)

    for d in lst:
        if d == 0 and pv > 0:  # Skip zeros in non-units places
            pv -= 1
            continue

        if pv == 0:  # Units place
            result.append(ones[d])
        elif pv == 1:  # Tens place
            if d == 1:  # Special case: numbers 10-19
                result.append(ones[d * 10 + lst[-1]])
                break
            else:
                result.append(tens[d])
        else:  # Hundreds, Thousands, Millions, etc.
            result.append(ones[d])
            if pv % 3 == 2:  # Every third place (Hundreds)
                result.append('HUNDRED')
            elif pv % 3 == 0 and pv > 0:  # Thousands, Millions, etc.
                result.append(place_values[pv // 3])
        
        pv -= 1

    return ' '.join(result).strip()

# Test case
print(num_to_words(550000))  # FIVE HUNDRED FIFTY THOUSAND
