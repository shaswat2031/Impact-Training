package Lecture2;
//print even numbers 1-100 and their sum

public class Numbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}