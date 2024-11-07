package Nov.ex_04112024_set_PQ_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab214_Map_p3 {
    public static void main(String[] args) {
        HashMap<String,String> s1=new HashMap();
        s1.put("name","pramod");
        s1.put("rool","1");
        s1.put("phone","89755433");
        System.out.println(s1);

        HashMap<String,String> s2=new HashMap();
        s2.put("name","thanu");
        s2.put("roll","2");
        s2.put("phone","99755433");
        System.out.println(s2);

        List l=new ArrayList<>();
        l.add(s1);
        l.add(s2);
        System.out.println(l);
    }
}
