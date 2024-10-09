package oct.ex_09102024_inheritance.single.ex1;

public class Son extends Father {
    //Son --> Father

    void bhk3(){
        System.out.println("bhk3");

        //Attribute Father
        System.out.println(gold_f);

        //Behaviour
        bhk2();
    }
}
