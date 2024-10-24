package oct.ex_21102024_wrapperclass;

public class Lab174_exception {
    public static void main(String[] args) {
        int c=0;
        //1
//        try{
//            c=10/c;
//            System.out.println(c);
//        }catch(Exception e){
//            System.out.println(e);
//        }

//        //2 but not getting need to ask
//        try{
//            c=10/c;
//            String s1=null;
//            s1.trim();
//            System.out.println(c);
//        }catch(ArithmeticException e){
//            System.out.println(e);
//        } catch (Exception e){
//            System.out.println(e);
//        }
        //3 -multiple
        try{
            c=10/c;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println(e);
        }

        try {
            String s1 = null;
            s1.trim();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
