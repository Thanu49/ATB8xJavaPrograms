package oct.ex_11102024_encapsulation.superkeyword;

public class Lab141 {
    public static void main(String[] args) {
        Baseclass t1=new testcase1();//Dynamic dispatch
        t1.openBrowser("chrome");
        t1.closeBrowser();

    }
}
