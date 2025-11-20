package lec8;
interface A{                    //u have to use all in child class if you are writting inside interface
    void login();
}
class  B implements A {       // implements works as extends
   public void login(){
    System.out.println("Hello");
   }
}

public class Interface {
    public static void main(String[] args) {
        B element=new B();
        element.login();
    }
    
}
