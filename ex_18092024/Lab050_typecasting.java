package sept.ex_18092024;

public class Lab050_typecasting {
    public static void main(String[] args) {
        //type casting =>source and destination conversion
        //widening --Implicit ,Explicit -lossless
        //narrowing -- Implicit and Explicit (with data type) loss

        //widening
        byte b=10;
        int a=b;//valid -Implicit casting jvm
        int a1=(int)b;//valid explicit casting -jvm

        //Narrowing

        int val =300;
        //byte b1=val;//Invalid Implicit casting -JVM
        byte b2=(byte)val;//Invalid Explicitt casting -loss of data
        //answer is 44 because it will convert the value into bytes the take .
        System.out.println(b2);
    }
}
