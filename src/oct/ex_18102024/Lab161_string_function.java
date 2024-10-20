package oct.ex_18102024;

public class Lab161_string_function {
    public static void main(String[] args) {
        String str=" Hello world ";
        // Length of the string

        System.out.println("length "+ str.length());

        //Substring
        System.out.println("substring " +str.substring(0,4) );

        //trim
        System.out.println("Trimmed "+ str.trim());

        //Convert to uppercase
        System.out.println("Uppercase: "+str.toUpperCase());

        //convert to lowercase
        System.out.println("lowercase: "+str.toLowerCase());

        System.out.println(str.charAt(4));

        System.out.println(str.indexOf("l"));

        System.out.println(str.contains("H"));
        System.out.println(str.isEmpty());
        System.out.println(str.split(" "));

        String name="pramod";
        String name2="pramOd";
        System.out.println(name.compareTo(name2) );
        //if both are equals give 0 compares lexicographically(ascii value)
        //otherwise gives the ascii value difference

        //strip and trim are almost same
        //but trim remove spaces in uni-code character also






    }
}
