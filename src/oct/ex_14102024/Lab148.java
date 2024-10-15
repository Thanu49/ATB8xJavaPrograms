package oct.ex_14102024;

public class Lab148 {
    public static void main(String[] args) {
        //I1 i=new I1(); it is not possible
//        ABC a=new ABC();
//        a.f1();
//        a.f4();

        XYZ x=new XYZ();
        x.display();
    }
}

class XYZ {
    void display(){
        new ABC().f4();
    }
}
class ABC implements I1,I2{
    @Override
    public void f1() {
        System.out.println("created f1");
    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {
        System.out.println("crested I2");
    }

    @Override
    public void f4() {
        System.out.println("f4");
    }
}
interface I1{
    void f1();
    void f2();
}

interface I2{
    void f3();
    void f4();
}