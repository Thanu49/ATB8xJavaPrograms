package Nov.ex_04112024_set_PQ_map.task_04112024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frequency_of_each_element_hashmap {
    public static void main(String[] args) {
        Integer[] num={2,2,3,4,5,5,5,3,2,4};
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int o:num){
            freq.put(o, freq.getOrDefault(o,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            System.out.println("element :" + entry.getKey() + " Frequency :"+entry.getValue());
        }

    }
}
