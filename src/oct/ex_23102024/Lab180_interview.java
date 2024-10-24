package oct.ex_23102024;

public class Lab180_interview {
    public static void main(String[] args) {


        try{
            String s1="pramod";
//            String a1=args[0];
//            int a=10/0;
            s1=null;
            System.out.println(s1.trim());
        }catch(Exception e){
            System.out.println("there is some problem with the code");
            System.out.println(e.getMessage());
        }

        System.out.println("End of the program!");
    }
}
