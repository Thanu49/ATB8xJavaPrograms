package Nov.ex_04112024_set_PQ_map;

public class Lab216_generic_p2 {
    public static void main(String[] args) {
        prints(1,true,"thanu");
    }

    public static <T1,T2,T3> void prints(T1 a,T2 b,T3 c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
