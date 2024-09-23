package sept.ex_23092024;

public class Lab087 {
    public static void main(String[] args) {
        char code ='C';
        switch(code){
            default:
                System.out.println("heloooo");//if break is missing
                //output is helooo and 65
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;

        }
    }
}
