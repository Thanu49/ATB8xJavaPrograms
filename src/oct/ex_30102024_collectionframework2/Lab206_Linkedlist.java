package oct.ex_30102024_collectionframework2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab206_Linkedlist {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();//stores in doubly linked list
        l.add("node 1");
        l.add("node 2");
        l.add("node 3");
        System.out.println(l);

        System.out.println("______________");


        ArrayList a=new ArrayList();//stores in countinous memory
        a.add("node 1");
        a.add("node 2");
        a.add("node 3");
        System.out.println(a);
    }
}
