package oct.ex_14102024;

public class Lab149 {

}

interface I3{
    default void start(){
        System.out.println("default is the only method having body");
    }

//    void f1(){
//
//    } we cannot do this it should be incomplete

    static void ss(){
        System.out.println("this also contains");
    }
}

abstract class AA{
    void f5(){
        System.out.println("concrete class");
    }
    abstract void f2();

    static void f7(){
        System.out.println("static method also possible");
    }
}
