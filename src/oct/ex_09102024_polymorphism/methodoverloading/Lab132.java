package oct.ex_09102024_polymorphism.methodoverloading;

public class Lab132 {
    public static void main(String[] args) {
        Mathoperations a=new Mathoperations();

        int result =a.add(3,4);
        System.out.println(result);

        String name = a.add("thanu ","shree");
        System.out.println(name);


        }
    }

