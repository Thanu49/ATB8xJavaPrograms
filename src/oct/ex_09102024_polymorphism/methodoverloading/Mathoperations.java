package oct.ex_09102024_polymorphism.methodoverloading;

public class Mathoperations {

    int add(int a,int b){
        return a+b;
    }
    String add(String c,String b){
        return c+b;
    }

    double add(double a,double b){
        return a+b;
    }
}
