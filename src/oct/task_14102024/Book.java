package oct.task_14102024;

abstract class Book {
    protected String name;
    protected String author;
    protected double price;

    Book(String name,String author,double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    abstract void getDetails();

}