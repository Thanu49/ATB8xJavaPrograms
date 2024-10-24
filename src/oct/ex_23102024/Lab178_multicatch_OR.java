package oct.ex_23102024;

public class Lab178_multicatch_OR {
    public static void main(String[] args) {
        int b=0;
        try{
            String ip =args[0];
            int a=Integer.parseInt(ip);
            b=1000/a;

        }catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
