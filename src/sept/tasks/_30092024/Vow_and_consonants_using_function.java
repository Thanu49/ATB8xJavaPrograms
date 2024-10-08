package sept.tasks._30092024;

public class Vow_and_consonants_using_function {
    public static void main(String[] args) {
        count_vow_con("thanu");
    }

    public static void count_vow_con(String name){
        int vcount=0;
        int ccount=0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                vcount+=1;
            }else{
                ccount+=1;
            }
        }
        System.out.println(vcount);
        System.out.println(ccount);

    }
}
