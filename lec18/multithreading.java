package lec18;

 class MyThread extends Thread {
        public void run() {
            for(int i=0;i<=5;i++){
            System.out.println(i);
            // System.out.println("Downloading file....."+(i*20)+"%");
        try {
            Thread.sleep(1000);  //timer
            
        } 
        catch (Exception e) {
        }
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
    }
}

