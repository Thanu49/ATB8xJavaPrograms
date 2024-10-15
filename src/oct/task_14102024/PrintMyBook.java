package oct.task_14102024;

public class PrintMyBook extends Book{

    @Override
    void getDetails(String name, String author, int price) {
        System.out.print(name+", ");
        System.out.print(author+", ");
        System.out.print(price+", ");

    }
}
