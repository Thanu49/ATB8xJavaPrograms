package oct.ex_28102024_collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab203_Arraylist_iterate {
    public static void main(String[] args) {
        List<String> names=new ArrayList();
        names.add("thanu");
        names.add("shree");
        names.add("guru");
        names.add("prasad");

        System.out.println("- To print Arraylist -2");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }
        System.out.println("for each-----------2-");
        for(Object o :names){
            System.out.println(o);
        }

        System.out.println("iterator --------3");

        //Iterator
        Iterator<String> iterate= names.iterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next());
        }
    }
}
