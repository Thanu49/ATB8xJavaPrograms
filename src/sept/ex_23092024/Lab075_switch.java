package sept.ex_23092024;

public class Lab075_switch {
    public static void main(String[] args) {
        //switch conditions
        //Days - 1 to 7 --> 1 mon, 2-tue,7 sun..
        int day = 3;
        switch(day){
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
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
