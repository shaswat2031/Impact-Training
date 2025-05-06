def anybase_to_decimal(number, base):
    """
    Convert a number from any base to decimal (base 10)
    
    Args:
        number (str): The number to convert (as a string)
        base (int): The base of the input number
        
    Returns:
        int: The decimal representation
    """
    decimal_value = 0
    power = 0
    
    # Process digits from right to left
    for digit in reversed(str(number)):
        # Convert digit to integer value
        if '0' <= digit <= '9':
            digit_value = int(digit)
        else:
            # For bases > 10, use letters A-Z
            digit_value = ord(digit.upper()) - ord('A') + 10
            
        if digit_value >= base:
            raise ValueError(f"Digit {digit} is not valid in base {base}")
            
        # Add digit value * base^power
        decimal_value += digit_value * (base ** power)
        power += 1
        
    return decimal_value

def decimal_to_anybase(decimal_num, base):
    """
    Convert a decimal number to any base
    
    Args:
        decimal_num (int): The decimal number to convert
        base (int): The target base
        
    Returns:
        str: The number represented in the target base
    """
    if decimal_num == 0:
        return '0'
        
    digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    result = ""
    
    while decimal_num > 0:
        remainder = decimal_num % base
        result = digits[remainder] + result
        decimal_num //= base
        
    return result

def anybase_to_anybase(number, source_base, target_base):
    """
    Convert a number from any base to any other base
    
    Args:
        number (str): The number to convert (as a string)
        source_base (int): The base of the input number
        target_base (int): The target base
        
    Returns:
        str: The number represented in the target base
    """
    # First convert to decimal
    decimal = anybase_to_decimal(number, source_base)
    
    # Then convert from decimal to target base
    return decimal_to_anybase(decimal, target_base)

# Example usage
if __name__ == "__main__":
    # Binary to decimal
    print(f"1101 (base 2) = {anybase_to_decimal('1101', 2)} (base 10)")
    
    # Decimal to binary
    print(f"13 (base 10) = {decimal_to_anybase(13, 2)} (base 2)")
    
    # Hexadecimal to decimal
    print(f"1A (base 16) = {anybase_to_decimal('1A', 16)} (base 10)")
    
    # Decimal to hexadecimal
    print(f"26 (base 10) = {decimal_to_anybase(26, 16)} (base 16)")
    
    # Binary to hexadecimal
    print(f"1101 (base 2) = {anybase_to_anybase('1101', 2, 16)} (base 16)")