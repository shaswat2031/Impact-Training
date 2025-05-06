package day4;

public class anybasetoanybaseconversion {

    // Convert decimal to any base
    public static String decimalToAnyBase(int decimal, int targetBase) {
        if (decimal == 0)
            return "0";

        StringBuilder result = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % targetBase;
            // Convert to character (0-9, A-F)
            char digit = remainder < 10 ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
            result.insert(0, digit); // Add to front of string
            decimal /= targetBase;
        }

        return result.toString();
    }

    // Convert from any base to decimal
    public static int anyBaseToDecimal(String number, int sourceBase) {
        int result = 0;

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            // Convert character to value
            int value = Character.isDigit(ch) ? ch - '0' : ch - 'A' + 10;
            // Add to result with proper place value
            result = result * sourceBase + value;
        }

        return result;
    }

    // Convert between any two bases
    public static String convert(String number, int sourceBase, int targetBase) {
        // Convert to decimal first, then to target base
        int decimal = anyBaseToDecimal(number, sourceBase);
        return decimalToAnyBase(decimal, targetBase);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Binary 1010 to decimal: " + anyBaseToDecimal("1010", 2));
        System.out.println("Decimal 42 to binary: " + decimalToAnyBase(42, 2));
        System.out.println("Hex 2A to binary: " + convert("2A", 16, 2));
        System.out.println("Octal 52 to decimal: " + anyBaseToDecimal("52", 8));
    }
}
