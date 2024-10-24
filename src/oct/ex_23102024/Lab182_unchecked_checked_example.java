package oct.ex_23102024;

import javax.swing.plaf.synth.SynthUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab182_unchecked_checked_example {
    public static void main(String[] args) {
        try {
            int c=10/0;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("unchecked");
        }
        try{
            FileReader f =new FileReader(new File("C://abc.txt"));
    }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally checked Exception");
        }

        }
}
