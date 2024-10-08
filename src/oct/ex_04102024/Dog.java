package oct.ex_04102024;

public class Dog {
    String name;
    int age;
    int legs;
    String breed;

    Dog(){
        System.out.println("I am DC");
        System.out.println("god is happy");
    }

    Dog(String nam,int ag,int leg,String bd){
        System.out.println("parameterised constructor");
        this.name=nam;
        this.age=ag;
        this.legs=leg;
        this.breed=bd;
    }
    void walk(){

    }

}
