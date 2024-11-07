package Nov.ex_04112024_set_PQ_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab213_map_p2 {
    public static void main(String[] args) {
        //Map<String ,Integer> m1=new HashMap<String,Integer>();
        //Map<String ,Integer> m1=new HashMap<>();
        //Map<String,Integer> m1=new HashMap();
        Map<String,Integer> m1=new TreeMap<>();
        m1.put("id",1);
        m1.put("id2",2);
        m1.put("id3",34);
        m1.put("id4",null);
        m1.put("id5",100);
        //m1.put(null,100);
        m1.put("id6",null);
        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.containsKey("ids"));
        System.out.println(m1.containsValue("null"));
        System.out.println(m1.keySet());
        System.out.println(m1.values());

        for(Map.Entry<String,Integer> item: m1.entrySet()){
            System.out.println(item.getKey() +"->"+ item.getValue());
        }



    }
}
