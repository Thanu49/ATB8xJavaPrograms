package Nov.ex_04112024_set_PQ_map.task_04112024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicate_elements {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,1,2};
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int o:num){
            h.put(o,h.getOrDefault(o,0)+1);
        }
        List res=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: h.entrySet()){
            if(entry.getValue()>1){
                res.add(entry.getKey());
            }
        }
        System.out.println(res);

    }
}
