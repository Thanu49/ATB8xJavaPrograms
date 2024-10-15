package oct.ex_11102024_encapsulation.superkeyword;

public class Baseclass {
    private String browser;
    Baseclass(){
        System.out.println("DC -Baseclass");
    }

    Baseclass(String b){
        System.out.println("CC -Baseclass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAuth) {
        if (isAuth){
            this.browser=browser;
        }else{
            System.out.println("Not allowed");
        }
    }
    void openBrowser(){
        System.out.println("chrome Browser");

    }

    void openBrowser(String browsername){
        System.out.println("Open browser -> "+ browsername);
    }

    void closeBrowser(){
        System.out.println("Close browser");
    }
}
