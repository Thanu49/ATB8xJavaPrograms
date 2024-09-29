package sept.tasks._25092024;

import java.util.Scanner;

public class prime_num_from_1_100 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            int count =0;
            for(int j=2;j<i+1;j++){
                if(i%j==0){
                    count+=1;
                }
            }
            if(count<=1){
                System.out.print(i+ " ");
            }

        }
    }
}
