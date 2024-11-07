package Nov.ex_04112024_set_PQ_map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab215_Hashtable {
    public static void main(String[] args) {
        //Map
        //only 1 null key

        //hashtable
        //Synchronised
        //slow
        //no null key or value
        //legacy class

        Hashtable<Integer,String> h=new Hashtable<>();
        h.put(1,"one");
        h.put(2,"two");
        h.put(3,"three");
        System.out.println(h);

        Enumeration<Integer> e=h.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
            System.out.println(e.nextElement());
            System.out.println(e.nextElement());
          //System.out.println(h.get(e.nextElement()));               //iteration happens using enumeration
          //System.out.println(h.get(e.nextElement()));               //iteration happens using enumeration
        }
    }
}

