package oct.ex_28102024_collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab204_vector {
    public static void main(String[] args) {
        List mylist=new ArrayList();
        mylist.add("thanu");
        mylist.add("shree");
        mylist.add("akarsh");
        mylist.add("guruprasad");
        mylist.add("bhagya");
        System.out.println(mylist);

        System.out.println("------------------------");
        Vector v=new Vector();
        v.add("thanu");
        v.add("vidhya");
        v.add("helan");
        System.out.println(v);

        //only problem with the vector
        //it is thread safe,synchronised
        //it will be time consumming
        //one by one -usage
        //slower

    }
}
