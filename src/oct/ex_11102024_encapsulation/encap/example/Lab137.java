package oct.ex_11102024_encapsulation.encap.example;

public class Lab137 {
    public static void main(String[] args) {
        ICICIBank amit=new ICICIBank("amit",1456789);

        //amit.bal=1000;

        amit.setBal(12345678,false);
        System.out.println(amit.getBal());
        amit.setName("thanu",true);
        System.out.println(amit.getName());

    }
}
