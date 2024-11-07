package Nov.ex_04112024_set_PQ_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab212_map {
    public static void main(String[] args) {
        //map -key and value pair
        //keys are always unique
        //cannot contains duplicate
        //only allows only 1 null key

        //Map m1 = new HashMap();
        //Map m1 = new LinkedHashMap();
        Map m1 = new TreeMap();


        m1.put("name", "thanu");
        m1.put("roll no", 123);
        m1.put("phone", 789064543);
        System.out.println(m1);
    }
}
