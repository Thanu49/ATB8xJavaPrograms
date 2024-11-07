package Nov.ex_04112024_set_PQ_map;

public class Lab216_generic {
    public static void main(String[] args) {
        tem(12);
        tem("thanu");
        tem(true);
        //T -> is just a reference
    }
    //generic supports all kind of datatypes
    public static <T> void tem(T a){
        System.out.println(a);
    }
}
