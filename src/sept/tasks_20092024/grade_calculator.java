package sept.tasks_20092024;

public class grade_calculator {
    public static void main(String[] args) {
        int score=85;
        String gradeA=(score>=90)?"A":"not A";
        String gradeB=(score>=80)?"B":"not B";
        String gradeC=(score>=70)?"C":"not C";
        System.out.println(gradeA);
        System.out.println(gradeB);
        System.out.println(gradeC);
    }
}
