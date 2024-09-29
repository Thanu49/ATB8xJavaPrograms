package sept.ex_25092024;

public class Lab108 {
    public static void main(String[] args) {
        //even and odd from 0-50
        for (int i=0;i<=50;i++){
            if(i%2==0){
                System.out.println("even -->" + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
