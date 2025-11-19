package lec7;
class Animal{
    void eat(){
        System.out.println("pani puri");
    }
    void timepass(){
        System.out.println("timepass");
    }
}
class Dog extends Animal{
    void eat(){
      System.out.println("dosa");

    }

    void sleep(){
        System.out.println("sleep");
    }
}

public class overridding {
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.eat();         //uppercast
        Dog d1=(Dog)a1;
        d1.sleep();      //lowercast
        Animal a2=new Animal();
        a2.eat();
        a2.timepass();
    }
}
