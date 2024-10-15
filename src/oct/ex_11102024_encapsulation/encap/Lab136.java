package oct.ex_11102024_encapsulation.encap;

public class Lab136 {
    public static void main(String[] args) {
        vwo login=new vwo("admin", "password1");
        System.out.println(login.password);

        login.password="hacker";
        System.out.println(login.password);

        Goodvwo l=new Goodvwo("password2","admin2");
        //System.out.println(l.password);
        System.out.println(l.getUsername());

        boolean isAdmin=false;
        l.setPassword("newpassword",isAdmin);
        System.out.println(l.getPassword());

    }
}
