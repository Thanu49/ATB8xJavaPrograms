package oct.ex_21102024_wrapperclass;

public class Lab172_exception {
    public static void main(String[] args) {
        int a=10;
        int c=a/0;//ArithmeticException it will terminate the programm
        //nextline won't print
        System.out.println(c);
        System.out.println("end");
    }
}
