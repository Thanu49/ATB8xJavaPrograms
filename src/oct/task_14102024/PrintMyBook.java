package oct.task_14102024;

public class PrintMyBook extends Book{
    public PrintMyBook(String name,String author,double price){
        super(name,author,price);
    }

    @Override
    void getDetails() {
        System.out.print(name+", ");
        System.out.print(author+", ");
        System.out.print(price+", ");

    }
}
