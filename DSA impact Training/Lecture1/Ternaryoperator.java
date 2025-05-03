package Lecture1;

public class Ternaryoperator {
    public static void main(String[] args) {
        // Example 1: Simple ternary operator to find max number
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Maximum number is: " + max);

        // Example 2: Checking if number is even or odd
        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);
    }
}
