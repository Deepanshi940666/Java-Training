package lec10;

class input {
   public final int x=20;
    // x=21;//error
   public final int a;
   input(){
    a=23;
   } 
}
public class finalkey{
    public static void main(String[] args) {
        input i1=new input();
        System.out.println(i1.x) ;
        input i2=new input();
        System.out.println(i2.a);
    }
}
