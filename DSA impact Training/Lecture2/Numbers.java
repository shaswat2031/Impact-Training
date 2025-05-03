package Lecture2;
//print 1-100 print numbers and also sum

public class Numbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}