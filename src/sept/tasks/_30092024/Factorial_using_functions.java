package sept.tasks._30092024;

import java.util.Scanner;

public class Factorial_using_functions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=factorial(n);
        System.out.println(res);
    }

    public static int factorial(int num){
        int fact =1;
        for (int i = num; i > 1; i--) {
            fact*=i;
        }
        return fact;
    }
}
