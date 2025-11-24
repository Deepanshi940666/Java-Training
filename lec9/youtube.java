package lec9;

class YouTube{
private String channel;
private int SubCount;
private int pin ;

public YouTube(String channel){      //constructor
this.channel= channel;
this.SubCount=0;
}

public  void getchannelName(){
    System.out.println(channel);
}

public void getSubscriberCount(int pin){
     if(pin==123){
        System.out.println(SubCount);
     }
   else{
    System.out.println("incorrect pin");
   }
}

public void setSubscribe(){
    SubCount++;
}

public void SetUnsubscribe(){
    if(SubCount>0){
        SubCount--;
    }
    else{
        System.out.println("0");
    }
}
}

public class youtube {
      public static void main(String[] args) {
       YouTube c1=new YouTube("TheCodertrial");
       c1.getchannelName();
       c1.getSubscriberCount(123);
    //    c1.setSubscribe();
    //    c1.getSubscriberCount();
    //    c1.setSubscribe();
    //    c1.getSubscriberCount();
    //    c1.getSubscriberCount();
    //    c1.SetUnsubscribe();
    //    c1.getSubscriberCount();

    }
    
}
