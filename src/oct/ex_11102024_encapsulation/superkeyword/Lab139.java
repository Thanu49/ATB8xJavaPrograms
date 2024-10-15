package oct.ex_11102024_encapsulation.superkeyword;

public class Lab139 {
    //super keyword in java is a reference variable that allows
    //a subclass (child class to reference the parent class).

    //1.use of super with variables.
    //2.use of super with Methods.
    //3.use of super with Constructors.
    public static void main(String[] args) {
        Car c=new Car();
    }
}

class Car extends vehicle{
    private int maxspeed=281;


     void display(){
        System.out.println("Child");
    }

    Car(){
        super(10);//constructor chaining
        System.out.println("DC Car");
        System.out.println(this.maxspeed);
        System.out.println(super.maxspeed);//parent

        this.display();
        super.display();
    }
}
class vehicle{
    public int maxspeed=180;

    void display(){
        System.out.println("Parent");
    }
    vehicle(){
        System.out.println("dc vehicle");
    }

    vehicle(int a){
        System.out.println("PC vehicle");
    }

    void message(){
        System.out.println("Hello vehicle");
    }

    void message(int a){
        System.out.println("hi vehicle");
    }
}

