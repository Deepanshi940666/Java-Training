package lec17;

class Mythread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
      
        for(int i=0;i<=5;i++){
            System.out.println(i+"t1");
            System.out.println("Downloading file....."+(i*20)+"%");
        try {
            Thread.sleep(3000);  //timer
            
        } 
        catch (Exception e) {
        }
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        t1.start();
      
        try {
            t1.join();  //mke squencial
        } catch (Exception e) {
        }

        // for(int i=0;i<5;i++){
        //     System.out.println(i+"main");
        // try {
        //     Thread.sleep(3000);  //timer
        //  } 
        // catch (Exception e) {
        // }
        // }
        // Mythread t2=new Mythread();
        // t2.start();
       
        // for(int i=0;i<5;i++){
        //     System.out.println(i+"t2");
        // }
    }
}
