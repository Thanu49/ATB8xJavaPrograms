package oct.task_14102024;

public class Interfaceex {
    public static void main(String[] args) {
        Book1 Mybook =new PrintMybook();
        Mybook.getdetails("Harry potter","J.k. Rowling", 100);
    }
}


class PrintMybook implements Book1{
    @Override
    public void getdetails(String name, String author, int price) {
        System.out.print(name+", ");
        System.out.print(author+", ");
        System.out.print(price+", ");
    }
}
interface Book1{
    void getdetails(String name,String author,int price);
}
