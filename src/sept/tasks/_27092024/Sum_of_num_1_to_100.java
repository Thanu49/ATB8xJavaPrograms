package sept.tasks._27092024;

import java.util.Scanner;

public class Sum_of_num_1_to_100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
