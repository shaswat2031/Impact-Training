package Lecture3;

public class Reverse {
    public static void main(String[] args) {
        int n = 12345;
        int reversedNumber = 0;
        while (n > 0) {
            int digit = n % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reversed Number: " + reversedNumber);

    }
}
