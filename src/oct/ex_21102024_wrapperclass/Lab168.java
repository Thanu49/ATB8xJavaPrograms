package oct.ex_21102024_wrapperclass;

public class Lab168 {
    public static void main(String[] args) {
        //advantage of wrapper class
        //we can't convert non-primitive(string)to primitive(int)
        String num="10";
        //int a =num; directly it is not possible
        Integer a= Integer.parseInt(num);
        //Integer b=Integer.valueOf(num);//use any one of this
        System.out.println(a);
        int a2=a;//unboxing

        //String to primitive?
        int a4=Integer.parseInt(num);
    }
}
