package oct.ex_23102024;

public class Lab177_multicatch {
    public static void main(String[] args) {
        try {
            String ip=args[0];//ArrayIndexOutOfBoundsException
            int a=Integer.parseInt(ip);//numberformatException
            int b=100/a;//ArithmeticException
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch(ArithmeticException e){
            System.out.println(e);
        } finally{
            System.out.println("i will be there always");
        }
    }
}
