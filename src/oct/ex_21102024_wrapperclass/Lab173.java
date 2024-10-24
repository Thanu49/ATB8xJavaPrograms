package oct.ex_21102024_wrapperclass;

public class Lab173 {
    public static void main(String[] args) {

        //Unchecked -java.lang.NullPointerException
        //JVM - at the Runtime -:> terminated the program
        String s1=null;
        System.out.println(s1.trim());//NullPointerException
    }
}
