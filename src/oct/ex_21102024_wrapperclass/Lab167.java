package oct.ex_21102024_wrapperclass;

public class Lab167 {
    public static void main(String[] args) {
        //primitive to wrapper class
        //if we use wrapper class we can get some functions.
        int a =10;
        Integer b=a; // boxing int -->Integer
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer a2 = 42;
        int value=a2;//unboxing
        System.out.println(value);

    }
}
