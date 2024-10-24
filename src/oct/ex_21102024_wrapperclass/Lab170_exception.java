package oct.ex_21102024_wrapperclass;

public class Lab170_exception {
    public static void main(String[] args) {
        System.out.println("start the program");
//        //we can give input from command line input also
//        String ip = args[0];
//        String ip1 = args[1];
//        String ip2 = args[2];
//        //String ip3=args[3];//ArrayIndexOutOfBoundsException
//        System.out.println(ip);
//        System.out.println(ip1);
//        System.out.println(ip2);

        String ip=args[0];//if you donot have any argument give//ArrayIndexOutOfBoundsException
        int a=Integer.parseInt(ip);//different datatype gives/NumberFormatException
        int b=1000/a;//0//ArithmeticException/by zero
        System.out.println(b);
        System.out.println("End of the program");


        //how the flow will work
        //JVM will be initialized(FROM RAM)
        //Creates and starts the main Thread -main method called
        //1) Collects the command line arguments -10
        //String[] args ={10}->
        //2) Lab_170_exception.main()
        //Now control will be transferred from main Thread to main method


        //When problem comes in main ->JVM will handle it
        //If you don't handle the exception JVM will handle it
        //Always terminate the program.


    }
}

