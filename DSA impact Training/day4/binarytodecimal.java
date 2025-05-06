package day4;

public class binarytodecimal {
    public static void main(String[] args) {
        int binary = 100101;
        int decimal = 0;
        int base = 1;
        int temp = binary;
        while (temp > 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;
            decimal += lastDigit * base;
            base = base * 2;

        }
        System.out.println("Decimal value of binary " + binary + " is: " + decimal);

    }
}
