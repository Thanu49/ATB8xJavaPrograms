package oct.ex_28102024_collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Lab199_list_Arraylist {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.indexOf("2"));
        System.out.println(list.lastIndexOf("3") );
    }
}
