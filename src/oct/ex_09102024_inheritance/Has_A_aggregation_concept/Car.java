package oct.ex_09102024_inheritance.Has_A_aggregation_concept;

public class Car {

    //Car has a engine ,tyre

    protected void startcar(){
        new Engine().start();
        new Tyre().rolling();
    }
}
