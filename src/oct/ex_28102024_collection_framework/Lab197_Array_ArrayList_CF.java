package oct.ex_28102024_collection_framework;

import java.util.ArrayList;
import java.util.Collection;

public class Lab197_Array_ArrayList_CF {
    public static void main(String[] args) {
       // Collection ---interface
        //List -Interface
        //ArrayList,LinkedList,Stack,and vector -class

        //example
        //Shopping -bread,milk,curd,panneer,buttermilk,butter
        //Collection of items -with same or different data type,
        //collection of students

        ArrayList studentlist=new ArrayList();
        studentlist.add("thanu");
        studentlist.add("shree");
        studentlist.add("thanu");//duplicate is allowed
        studentlist.add("guru");
        studentlist.add(true);//different data types is allowed
        studentlist.add(123);
        studentlist.add(null);
        System.out.println(studentlist);


    }
}
