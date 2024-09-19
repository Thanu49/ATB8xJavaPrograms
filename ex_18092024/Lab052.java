package sept.ex_18092024;

public class Lab052 {
    public static void main(String[] args) {
        //GST =18.45;
        int course=100;
        float GST=18.45f;
        //int totap=course+GST; //Narrowing -implicit -jvm -invalid
        //float totap=course+GST; //widening -implicit -jvm -invalid

        int totalp=course+ (int)GST;//Narrowing -Explicit -Loss
        System.out.println(totalp);
    }
}
