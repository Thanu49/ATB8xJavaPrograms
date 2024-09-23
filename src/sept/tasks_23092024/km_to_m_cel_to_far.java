package sept.tasks_23092024;

public class km_to_m_cel_to_far {
    public static void main(String[] args) {
        int choice=1;
        int km=5;
        int f=98;
        switch(choice){
            case 1:
                int res = km*1000;
                System.out.println(res + " m");
                break;
            case 2:
                double res1 = ((f -32)*5/9);
                System.out.println(res1+ " celsius");
                break;
            default:
                System.out.println("not valid");
                break;
        }
    }
}
