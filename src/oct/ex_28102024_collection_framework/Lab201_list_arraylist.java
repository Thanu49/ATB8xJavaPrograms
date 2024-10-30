package oct.ex_28102024_collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab201_list_arraylist {
    public static void main(String[] args) {
        List marks=new ArrayList();
        marks.add(56);
        marks.add(97);
        marks.add(78);
        marks.add(100);
        marks.add(60);
        System.out.println(marks);

        //sorting
        //Collections.sort(marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
