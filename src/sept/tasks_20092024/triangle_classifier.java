package sept.tasks_20092024;

public class triangle_classifier {
    public static void main(String[] args) {
        int side1=10,side2=10,side3=10;
        if(side1==side2 && side2==side3 && side1==side3){
            System.out.println("equilateral");
        }else if(side1==side2 || side2==side3 || side1==side3){
            System.out.println("isosceles");
        }else{
            System.out.println("scalene");
        }
    }
}
