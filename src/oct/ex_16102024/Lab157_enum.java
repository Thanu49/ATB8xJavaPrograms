package oct.ex_16102024;

public class Lab157_enum {
    public static void main(String[] args) {
        System.out.println(color.RED.getHexcode());
        System.out.println(color.GREEN.getHexcode());

    }
}

enum color{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF");

    private String hexcode;

    private color(String hexcode){
        this.hexcode=hexcode;
    }

    public String getHexcode(){
        return this.hexcode;
    }
}
