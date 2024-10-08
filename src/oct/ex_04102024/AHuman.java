package oct.ex_04102024;

public class AHuman {
    String eyes_color;
    String names;
    long aadhar_card_number;

    //Default constructor
    AHuman(){
        System.out.println("I will be called,object is created");
        //write a code here which will br automatically called when object is created
        //Read a file text
        //read a csv,excel here......
    }

    //parameterized constructors
    AHuman(String name){
        System.out.println("parameterized");
        this.names=name;
    }

    void walk(){
        System.out.println("NRNA");
    }

    int talk(){
        System.out.println("RTNA");
        return 10;
    }

    String sleep(String name){
        System.out.println("WRWA");
        return "I am sleeping";
    }

    void eat(String name){
        System.out.println("NRWA");
    }
}
