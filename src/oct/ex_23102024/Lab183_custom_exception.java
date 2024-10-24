package oct.ex_23102024;

public class Lab183_custom_exception {
    public static void main(String[] args) throws Exception {
            Bank sbi =new Bank("INR",100);
            Bank    ICICI=new Bank("INR",100);
            Bank JP_chase=new Bank("USB",123);
            System.out.println(sbi.add(ICICI));
            System.out.println(sbi.add(JP_chase));

    }
}
