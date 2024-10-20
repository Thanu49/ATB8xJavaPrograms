package oct.ex_18102024;

public class Lab160_string_functions {
    public static void main(String[] args) {
        String s1="Hello";//scp
        String s4="Hello";
        String s5="hello";
        String s2=new String("Hello");//object area
        String s3=new String("Hello");//object area


        System.out.println(s1==s2);//false bcz stores in different location
        System.out.println(s2==s3);//false
        // == this is checking for the reference location in case of string
        System.out.println(s1==s4);//true

        //how can i check value
        System.out.println(s1.equals(s2));//true bcz checking values
        System.out.println(s2.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s5));

    }
}
