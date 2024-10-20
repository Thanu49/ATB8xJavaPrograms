package oct.ex_16102024;

public class Lab153_Static {
    public static void main(String[] args) {
        Student s1=new Student(23);
        Student s2=new Student(43);

        System.out.println(s1);// s1.age  is created with object        System.out.println(Student.school_name);//we are accessing static variable using class name
        //because it is created/loaded with class
        Student.school_name="xyz";
        System.out.println(Student.school_name);
    }
}
class Student{
    int age;
    static String school_name;

    {
        System.out.println("IIB");
        System.out.println("here you can write a code what you want to do while creating object ");

    }

    static {
        System.out.println("SIB");
        System.out.println("it is created once when class is created");
    }

    public Student(int age){
        this.age=age;
    }
}
