package oct.task_25102024;

import java.util.Scanner;

public class Pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k < (2*i); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
