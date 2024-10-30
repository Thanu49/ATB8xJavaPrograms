package oct.ex_30102024_set;

import java.util.*;

public class Lab209_set {
    public static void main(String[] args) {
        //List duplicates allows

        //Set doesn't allow duplicate

        //3 types

        Set hs=new HashSet();//Hashing mechanism to store elements ,no order
        hs.add("apple");
        hs.add("orange");
        hs.add("banana");
        hs.add("grapes");
        hs.add(null);
        System.out.println(hs);

        Set lhs=new LinkedHashSet();//Linkedlist mechanism to store the element,order will maintain
        lhs.add("apple");
        lhs.add("orange");
        lhs.add("banana");
        lhs.add("grapes");
        lhs.add(null);
        System.out.println(lhs);

        Set ts =new TreeSet();//Black and Red mechanism to store the element,
        //order will maintain,natural sorting is done
        ts.add("apple");
        ts.add("orange");
        ts.add("banana");
        ts.add("grapes");
        //ts.add(null);//nullpointerexception because we can;t sort
        System.out.println(ts);

        for (Object o:hs){
            System.out.println(o);
        }
        System.out.println("___________________");
        Iterator i=ts.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
}
