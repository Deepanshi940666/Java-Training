package lec8;
interface A{                    //u have to use all in child class if you are writting inside interface
    void login();
}
interface B{
    void login();
}
class C implements A,B {       // implements works as extends
   public void login(){
    System.out.println("Hello");
   }
}
// class D implements A,B{
//     public void login(){
//     System.out.println("Hii");
//    }
// }

public class multipleParent {
     public static void main(String[] args) {
        C element=new C();
        element.login();
        // D val =new D();
        // val.login();
    }
}
