package lec8;

interface Walkable{
    void walk();
}
interface runable{
    void run();
}
class Human implements Walkable,runable{
    public void walk() {
        System.out.println("walking");
    }
    public void run() {
        System.out.println("running");
    }
    
}
public class Ques1 {
    public static void main(String[] args) {
     Human h1=new Human();
    h1.walk();
    h1.run();
    }

}
