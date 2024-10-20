package oct.task_18102024;

import java.util.Scanner;

public class reverse_the_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String result=" ";
        int n=s1.length();
        for (int i =1;i <= n; i++) {
            char r=(s1.charAt(n-i));
            result += r;
        }
        System.out.println(result);
    }
}
