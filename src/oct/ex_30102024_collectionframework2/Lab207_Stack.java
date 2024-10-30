package oct.ex_30102024_collectionframework2;

import java.util.Stack;

public class Lab207_Stack {
    public static void main(String[] args) {
        //vector,stack  are legecy classses
        //95% of time we are not going to use
        //in automation

        Stack s=new Stack();
        s.add("thanu");
        s.add("shree");
        System.out.println(s);//LIFO

        Stack books =new Stack();
        books.add("python");
        books.add("java");
        books.add("c#");
        System.out.println(books);
        System.out.println(books.pop());//remove the last element
        books.add(0,"php");
        System.out.println(books);

        System.out.println(books.peek());//just checking the last element
        System.out.println(books);

    }
}
