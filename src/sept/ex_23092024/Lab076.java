package sept.ex_23092024;

public class Lab076 {
    public static void main(String[] args) {
        //if break is not added
        int day = 1;
        switch(day){
            case 1:
                System.out.println("mon");
            case 2:
                System.out.println("tue");
            case 3:
                System.out.println("wed");
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("end of the loop");
                break;

        }

    }
}
