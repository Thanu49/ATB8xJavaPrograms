package oct.ex_14102024;

public class Lab144 {
    public static void main(String[] args) {
        CHROMETC c=new CHROMETC();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");
        c.takescreenshot();
        c.hidden();

        FIREFOXTC f=new FIREFOXTC();
        f.openBrowser("Firefox");
        f.closeBrowser("Firefox");
    }
}
