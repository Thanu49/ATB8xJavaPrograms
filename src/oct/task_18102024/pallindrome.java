package oct.task_18102024;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String res="";
        int n=s1.length();
        for(int i=1;i<=n;i++){
            char c=s1.charAt(n-i);
            res+=c;
        }
        System.out.println(res);
        if (res.equals(s1)){
            System.out.println("yes pallindrome");
        }else{
            System.out.println("No not a pallindrome");
        }
    }
}
