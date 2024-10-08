package oct.task_04102024;

public class Person {
    String name;
    int age;
    String gender;
    String colour;
    String eye_colour;
    float height;
    int weight;
    String hair_colour;
    String behaviour;
    String profesion;

    Person() {
        System.out.println("default constructor created");
    }

    Person(String name, int age, String gender) {
        System.out.println("parameterised constructor");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void details(String colour, String eye_colour, String hair_colour) {
        this.colour = colour;
        this.eye_colour = eye_colour;
        this.hair_colour = hair_colour;
        System.out.println(colour);
        System.out.println(eye_colour);
        System.out.println(hair_colour);

    }

    String profession(String profesion) {
        this.profesion = profesion;
        return profesion;
    }

    void hw(float height, int weight) {
        this.height = height;
        this.weight = weight;
        System.out.println(height);
        System.out.println(weight);
    }

    String behaviour() {
        return ("introvert");
    }

}





