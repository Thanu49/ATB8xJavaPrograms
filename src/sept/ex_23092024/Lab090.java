package sept.ex_23092024;

public class Lab090 {
    public static void main(String[] args) {
        char ch='A';
        switch(ch){
            case 'A'+1://if we use case 'A' it will give error
                System.out.println("A");
                break;
            case 65:
                System.out.println("65");
                break;
        }
    }
}
