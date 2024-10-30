package oct.ex_30102024_collectionframework2;

import java.util.ArrayList;
import java.util.List;

public class Lab208_list {
    public static void main(String[] args) {
        Student s1=new Student("thanu",56);
        Student s2=new Student("shree",67);
        Student s3=new Student("guru",90);
        List<Student> mystudent = new ArrayList<>();
        mystudent.add(s1);
        mystudent.add(s2);
        mystudent.add(s3);
        System.out.println(s1.printdetails());
    }
}


class Student{

    String name;
    Integer Roll_no;

    public Student(String name, Integer roll_no) {
        this.name = name;
        Roll_no = roll_no;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(Integer roll_no) {
        Roll_no = roll_no;

    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", Roll_no=" + Roll_no +
//                '}';
    public String printdetails(){
        return "Student{" +
                "name='" + name + '\'' +
                ", Roll_no=" + Roll_no +
                '}';


    }
}

