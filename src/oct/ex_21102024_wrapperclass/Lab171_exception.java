package oct.ex_21102024_wrapperclass;

import java.io.FileInputStream;

public class Lab171_exception {
    public static void main(String[] args) {


        //checked --JVM knows the exception
        //FileInputStream file = new FileInputStream("C://a.txt");
        //JVM knows this that file may not exist

        //Unchecked Exception - Arithmetic exception
        int a = 10;
        int c = a / 0;
        System.out.println(c);
    }
}
