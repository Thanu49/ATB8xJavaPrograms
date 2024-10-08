package sept.ex_30092024;

public class Lab122 {
    public static void main(String[] args) {
        int s=function4(3,4);
        System.out.println(s);

    }

//    //2.without Parameters but with Return Type
//    public static String function_type2() {
//        System.out.println("without parameters but with return Type");
//        return "thanu";
//    }
//    ////3.with Parameters but without Return Type
//    public static void function3(String name){
//        System.out.println("with parameters and without return type");
//        System.out.println("we have shared " + name);
//    }

    //4.with Parameters but with Return Type
    public static int function4(int a,int b){
        System.out.println("with parameters and with return type");
        return a+b;
    }

}
