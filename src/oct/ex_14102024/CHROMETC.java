package oct.ex_14102024;

public class CHROMETC extends BaseClass {
    @Override
    void openBrowser(String browser) {
        System.out.println("open the chrome");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("close the browser");
    }
}
