package sept.tasks._27092024;

public class first_5_even_numbers {
    public static void main(String[] args) {
        int count=0;
        int i=0;
        do{
            if (i%2==0){
                System.out.println(i);
            }
            i+=2;
            count++;
        }while (count<5);
    }
}
