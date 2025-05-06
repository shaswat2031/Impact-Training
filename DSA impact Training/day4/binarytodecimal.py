def binary_to_decimal_builtin(binary_str):
    try:
        return int(binary_str, 2)
    except ValueError:
        print("Invalid binary number. Please use only 0s and 1s.")
        return None

def binary_to_decimal_manual(binary_str):
    # Validate input
    if not all(bit in '01' for bit in binary_str):
        print("Invalid binary number. Please use only 0s and 1s.")
        return None
    
    decimal = 0
    for i, bit in enumerate(reversed(binary_str)):
        decimal += int(bit) * (2 ** i)
    return decimal

def decimal_to_binary_builtin(decimal_num):
    try:
        if decimal_num < 0:
            print("Please enter a positive number.")
            return None
        return bin(decimal_num)[2:]  # Remove '0b' prefix
    except ValueError:
        print("Invalid decimal number.")
        return None

def decimal_to_binary_manual(decimal_num):
    if decimal_num < 0:
        print("Please enter a positive number.")
        return None
    
    if decimal_num == 0:
        return "0"
    
    binary = ""
    while decimal_num > 0:
        binary = str(decimal_num % 2) + binary
        decimal_num //= 2
    return binary

# Main program
print("Binary/Decimal Converter")
print("1. Convert Binary to Decimal (using built-in function)")
print("2. Convert Binary to Decimal (manual calculation)")
print("3. Convert Decimal to Binary (using built-in function)")
print("4. Convert Decimal to Binary (manual calculation)")

choice = input("Enter your choice (1-4): ")

if choice == "1" or choice == "2":
    binary = input("Enter binary number: ")
    if choice == "1":
        result = binary_to_decimal_builtin(binary)
    else:
        result = binary_to_decimal_manual(binary)
    
    if result is not None:
        print(f"{binary} in decimal is {result}")

elif choice == "3" or choice == "4":
    try:
        decimal = int(input("Enter decimal number: "))
        if choice == "3":
            result = decimal_to_binary_builtin(decimal)
        else:
            result = decimal_to_binary_manual(decimal)
        
        if result is not None:
            print(f"{decimal} in binary is {result}")
    except ValueError:
        print("Please enter a valid number.")

else:
    print("Invalid choice.")
