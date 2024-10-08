package oct.ex_02102024;


import sept.Person;

public class Lab124 {
    public static void main(String[] args) {
        //class -> blueprint to create something
        //objects ->instance of the class -created from the class.

        ATBStudent amit=new ATBStudent();
        amit.age=29;

        ATBStudent jevan=new ATBStudent();
        jevan.age=40;

        Person s=new Person();
        s.name="thanu";

        new Person();

        System.out.println(amit);
        System.out.println(jevan);

        //amit --reference vaiable 8 Bytes ,64 bits null default value
        
    }
}
