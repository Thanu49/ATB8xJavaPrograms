package oct.ex_23102024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab184_throws {
    public static void main(String[] args) throws FileNotFoundException {
        extracted();
    }

    private static void extracted() throws FileNotFoundException{
        FileInputStream fileinputstrem =new FileInputStream("C://abc.txt");
    }
}
