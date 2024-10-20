package oct.ex_18102024;

public class Lab163_stringbuffer_string_builder {
    public static void main(String[] args) {
        //to create mutable string we are using this

//        String name ="pramod";
//        name="shree";
        StringBuffer StringBuffer =new StringBuffer("thane");
        StringBuffer.append("shree");
        System.out.println(StringBuffer);


        //c1,c2-->toy
        //c1--toy -->2 hours c2-- toy -->2 hours -->tread safety

        StringBuilder sb=new StringBuilder("thanu");

        //Appending to stringbuilder
        sb.append("shree");
        System.out.println(sb);

        sb.insert(3," ");
        System.out.println(sb);

        sb.delete(3,5);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);


    }
}
