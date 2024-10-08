package oct.task_02102024;

public class ATB_object {
    public static void main(String[] args) {
        ATBStudent s1=new ATBStudent();
        ATBStudent s2=new ATBStudent();
        ATBStudent s3=new ATBStudent();
        ATBStudent s4=new ATBStudent();
        ATBStudent s5=new ATBStudent();

        s1.details("thanu",20,"8x","thanu@gmail.com",94345678);
        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s1.batch);
        System.out.println(s1.email);
        System.out.println(s1.num);

        s1.task(true);

        s2.details("vidhya",22,"8x","vidhya@gmail.com",94345878);
        System.out.println(s2.name);
        System.out.println(s2.id);
        System.out.println(s2.batch);
        System.out.println(s2.email);
        System.out.println(s2.num);

        s2.task(false);


        s3.details("Helan",24,"8x","Helan@gmail.com",99845678);
        System.out.println(s3.name);
        System.out.println(s3.id);
        System.out.println(s3.batch);
        System.out.println(s3.email);
        System.out.println(s3.num);

        s3.task(true);


        s4.details("anbu",26,"8x","anbu@gmail.com",943409878);
        System.out.println(s4.name);
        System.out.println(s4.id);
        System.out.println(s4.batch);
        System.out.println(s4.email);
        System.out.println(s4.num);

        s4.task(false);

        s5.details("maanu",28,"8x","maanu@gmail.com",904345678);
        System.out.println(s5.name);
        System.out.println(s5.id);
        System.out.println(s5.batch);
        System.out.println(s5.email);
        System.out.println(s5.num);

        s5.task(true);




    }
}
