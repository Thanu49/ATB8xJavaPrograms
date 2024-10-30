package oct.ex_23102024;

public class Lab179 {
    public static void main(String[] args) {
        System.out.println("start the program");
        String ip =null;

        try{
            ip=args[0];

        }catch(ArrayIndexOutOfBoundsException e){
            throw new RuntimeException(e);
        }

        int a=0;
        try{
            a=Integer.parseInt(ip);

        }catch(NumberFormatException e){
            throw new RuntimeException(e);
        }

        int b=0;
        try{
            b=1000/a;
        }catch(ArithmeticException e){
            throw new RuntimeException(e);
        }
        System.out.println((b));
        System.out.println("End of the program");
    }
}