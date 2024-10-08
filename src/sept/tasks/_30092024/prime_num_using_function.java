package sept.tasks._30092024;

public class prime_num_using_function {
    public static void main(String[] args) {
        prime(20);
    }

    public static void prime(int n){
        for (int i = 2; i < n; i++)
        {   int count=0;

            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    count+=1;
                }

            }if (count<1){
                System.out.println(i);
        }

        }
    }
}
