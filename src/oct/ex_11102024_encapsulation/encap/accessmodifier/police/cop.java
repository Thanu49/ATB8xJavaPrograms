package oct.ex_11102024_encapsulation.encap.accessmodifier.police;

public class cop {
    private int gun;
    private String idcard;

    public cop(int gun) {
        this.gun = gun;
    }

    protected void canIshoot(){//only the same folder class allowed to use the methods
        System.out.println("yes you can!");
    }
}
