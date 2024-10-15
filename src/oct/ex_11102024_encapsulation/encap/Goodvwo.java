package oct.ex_11102024_encapsulation.encap;

public class Goodvwo {
    private String username;
    private String password;

    public Goodvwo(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {//you can also change the name of method the hacker will not access
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
       //adding security
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Not allowed");
        }
    }
}
