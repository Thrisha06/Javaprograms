import java.util.*;
class Task extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }try{
            Thread.sleep(1000);
        }catch(java.lang.InterruptedException e){
           
        }
    }

}
class Task1 implements Runnable{
    public void run(){
        for(int i=6;i<=10;i++){
            System.out.println(i);
        }try{
            Thread.sleep(1000);
        }catch(java.lang.InterruptedException e){
           
        }
    }

}

public class JavaMultiThreading{
    public static void main(String[] args){
        Task t1=new Task();
        Task1 t2=new Task1();
        Thread trd1=new Thread(t1);
        Thread trd2=new Thread(t2);
        trd1.setName("trd1");
        trd2.setName("trd2");
        trd1.start();
        trd2.start();
    }
}
