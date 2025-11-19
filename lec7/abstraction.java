package lec7;
abstract class Animal{
    abstract void eat();
}
class Cat extends Animal{
    void eat(){
      System.out.println("panipuri");  
    }
}
public class abstraction {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.eat();
    }
}
