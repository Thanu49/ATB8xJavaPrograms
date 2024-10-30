package oct.ex_25102024;

import java.util.Arrays;

public class Lab190_array_sort {
    public static void main(String[] args) {
        int[] marks={51,100,91,87,90};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Arrays.sort(marks);
        System.out.println("-----------------");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        int item=Arrays.binarySearch(marks,90);
        System.out.println(item);
    }
}
