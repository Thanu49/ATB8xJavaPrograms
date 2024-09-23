package sept.ex_23092024;

public class Lab084 {
    public static void main(String[] args) {
        int itemcode = 010;
        switch(itemcode){//instead of break we are using "->" sign
            case 001,010 -> System.out.println("it is a laptop");
           // System.out.println("it is a desklaptop");
            //multiple sop statement are not allowed
            case 002 -> System.out.println("it is a desktop");
            case 003,004 ->System.out.println("it is a mobile");
            default -> System.out.println("heloo!");
        }
    }
}
