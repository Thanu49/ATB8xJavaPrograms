package oct.ex_16102024;

public class Lab158_enum {
    public static void main(String[] args) {
        System.out.println(APICONSTANTENDPOINTS.BaseURL.getName());
    }
}

//store the APIconstanta -Endpoints

enum APICONSTANTENDPOINTS{

    BaseURL("https://app.vwo.com"),
    Login_page("https://app.vwo.com/Login"),
    Dashboard_url("https://app.vwo.com/dashboard"),
    chaturl("https://app.vwo.com/chat");

    private String name;

    APICONSTANTENDPOINTS(String name){
        this.name=name;
    }

    String getName(){
        return name;
    }
}
