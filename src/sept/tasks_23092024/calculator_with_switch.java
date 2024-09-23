package sept.tasks_23092024;

public class calculator_with_switch {
    public static void main(String[] args) {
        char op='*';
        int num1= 5;
        int num2=10;
        switch(op){
            case '+':
                System.out.println("addtion " + (num1+num2));
                break;
            case '-':
                System.out.println("subtraction " + (num1-num2));
                break;
            case'*':
                System.out.println("multiplication " + (num1*num2));
                break;
            case'/':
                System.out.println("division " + (num1/num2));
                break;
            default:
                System.out.println("not an operator");
                break;
        }
    }
}
