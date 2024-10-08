package sept.ex_30092024;

public class Lab123 {
    public static void main(String[] args) {
            first5evennum();

    }

    public static void first5evennum() {
        int count = 0;
        int i = 2;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i += 2;
            count++;
        } while (count < 5);
    }

}
