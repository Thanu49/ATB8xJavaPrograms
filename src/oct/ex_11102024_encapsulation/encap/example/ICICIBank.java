package oct.ex_11102024_encapsulation.encap.example;

public class ICICIBank {
    //Encapsulation
    //it is a fundamental concept in oops
    //Bundling of data and methods that operate on that data within a single unit.
    //Data members should be private in nature.
    //Methods with getter and setter only ,you can access the data members/attributes.
    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name,boolean are_you_Admin) {
        if(are_you_Admin) {
            this.name = name;
        }
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isAdmin) {
        if (isAdmin){
            this.bal = bal;
        }else{
            System.out.println("not allowed");
        }
    }
}
