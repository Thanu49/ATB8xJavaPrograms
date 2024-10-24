package oct.ex_23102024;

public class Lab176_exception {
    public static void main(String[] args) {

        int a=0;
        try {
            int c=10/a;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);//throw should always be last statement

        } finally {
            System.out.println("I will be always executed");
        }
    }
}
