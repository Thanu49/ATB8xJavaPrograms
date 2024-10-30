package oct.ex_28102024_collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Lab200_List_ArrayList_for {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("bread");
        list.add("milk");
        list.add("butter");
        list.add("paneer");
        list.add("jam");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-----for each----");

        for(Object o:list){
            System.out.println(o);
        }
    }

}
