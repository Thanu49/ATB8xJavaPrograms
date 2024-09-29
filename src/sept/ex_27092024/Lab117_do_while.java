package sept.ex_27092024;

public class Lab117_do_while {
    public static void main(String[] args) {
        //while -> int -> condition -> body -> increment/decrement
        //Do-while -> int --> body -> condition -> increment/Decrement

        int a = 0;
        do {
            System.out.println("print" + a);
            a++;
        } while (a < 0);
    }
}