package day4;

public class decmialtobinary {
    public static void main(String[] args) {
        int n = 45;
        int binary[] = new int[100];
        int i = 0;
        while (n > 0) {
            binary[i] = n % 2;
            n = n / 2;
            i++;
        }

        // Print binary representation
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }
}
