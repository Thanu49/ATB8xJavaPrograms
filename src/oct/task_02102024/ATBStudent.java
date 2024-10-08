package oct.task_02102024;

public class ATBStudent {
    String name;
    int id;
    String batch;
    String email;
    long num;
    boolean task_done;

    void details(String name,int id,String batch,String email,long num){
        this.name=name;
        this.id=id;
        this.batch=batch;
        this.email=email;
        this.num=num;
    }
    void task(boolean result){
            this.task_done=result;
            if (result==true) {
                System.out.println("completed task");
            }else{
                System.out.println("not done");
            }
    }
}
