package sept.ex_23092024;

public class Lab079 {
    public static void main(String[] args) {
        //web automation
        //I will ask user which browser you want me to run the code
        //chrome -> execute chrome
        //firefox -> execute on firefox
        //edge -> edge cases

        String browser="opera";
        switch(browser){
            default://we can place default whereever we can place
                System.out.println("I don't have idea about the browser");
                break;
            case "chrome":
                System.out.println("starting thechrome browser");
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                break;
            case "edge":
                System.out.println("starting the edge browser");
                break;

        }

    }
}
