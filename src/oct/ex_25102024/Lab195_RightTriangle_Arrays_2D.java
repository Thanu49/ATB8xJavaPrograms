package oct.ex_25102024;

import java.util.Scanner;

public class Lab195_RightTriangle_Arrays_2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        //int c=sc.nextInt();

        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
