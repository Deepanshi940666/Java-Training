package lec6;
class Car{  
    int x; 
    String name;                       
    Car(int x,String name){       //constructor calling 
        this.x=x;
        this.name=name;
           System.err.println(x);
           System.err.println(name);
        // if(x>5){
        // System.out.println("Hii");
        // }
        // else{
        //   System.out.println("bye");   
        // }
    }
}

public class main {
    public static void main(String[] args) {
        Car s1=new Car(3,"Deepanshi");       //object is created 
        Car s2=new Car(7,"Deepti"); 
        Car s3=new Car(4,"Deepak");
        Car s4=new Car(4,"Devansh");

    }
}