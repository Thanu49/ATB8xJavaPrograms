package sept.tasks_20092024;

public class max_of_3numbers_using_ternary_operator {
    public static void main(String[] args) {
        int a=10,b=20,c=45;
        int res=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(res);
    }
}
