package oct.ex_09102024_polymorphism.methodoverriding;

public class Hound extends Dog{
    @Override
    void bark(){
        //super.bark();
        System.out.println("I am Hound,I will Bark");
    }
}
