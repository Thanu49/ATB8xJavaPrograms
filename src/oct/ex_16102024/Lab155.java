package oct.ex_16102024;

public class Lab155 {
    public static void main(String[] args) {
        ATB s1=new ATB("amit");
        ATB s2=new ATB("thanu");

        ATB s3=new ATB("vidhya");
        ATB s4=new ATB("balam");
        new ATB("pramod");

        s1.dosomething();

        ATB.doassignment();

    }
}

class ATB{
    {
        System.out.println("IIB");
        //what is the purpose?
        //here you can write a code related to
        //Start a website or anything before starting the
        //web automation or API automation
        System.out.println("Reading from CSV file");

    }

    static {
        System.out.println("Load th class?,I will execute");

    }

    private String name;
    private String phone;
    static String courseName="ATB8x";

    public String getName(){
        return name;
    }

    public void setName(){
        this.name=name;
    }

    public ATB(String name){
        this.name=name;
    }

    void dosomething(){
        System.out.println("non static method");
        System.out.println(courseName);//normal method can have static variable
    }

    static void doassignment(){
        //System.out.println(phone); static functions cannot have a instance variable in them
        System.out.println("do assignment");
    }

    static class GenAI{
        //in automation we will use rare
    }
}