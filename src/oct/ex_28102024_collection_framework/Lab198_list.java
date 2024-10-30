package oct.ex_28102024_collection_framework;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab198_list {
    public static void main(String[] args) {
        //List list = new List(); we cannot create object for interface or abstrct class
        List list =List.of("banana","apple","grapes"," orange");
        System.out.println(list);
        System.out.println(list.size());
        //list.add("guava"); UnsupportedOperationException
        //because it is an abstract method


    }
}

