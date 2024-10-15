package oct.ex_11102024_encapsulation.superkeyword;

public class testcase1 extends Baseclass{
    //Testcase is a type of baseclass -single inheritance
    testcase1(){
        super();//DC of parent
        System.out.println("test cantsructor");
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}
