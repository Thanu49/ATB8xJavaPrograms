package oct.ex_23102024;

public class Lab178_parent {
    public static void main(String[] args) {
        int b=0;
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            b = 100 / a;
//        }catch(Exception e) {
//            System.out.println(e);
//        }
        }catch (Throwable e){
            System.out.println(e);
        }
//        catch(object e){
//            System.out.println(e.getMessage());
//        }we can't use object 

    }
}
