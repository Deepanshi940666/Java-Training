//Create an abstract class 'Shape' with an abstract method 'area()'. Implement two subclasses'Circle' and 'Rectangle'.
package lec7;
abstract class Shape{
   abstract void area(float n,float m);
}
class Circle extends Shape{
    void area(float n,float m){
        System.out.println("Area of circle is "+n*n*m);
    }
}
class Rectangle extends Shape{
    void area(float n,float m){
        System.out.println("Area of Rectangle is "+n*m);
    }
}
public class abstraction2 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.area(2.0f, 3.14f);
        Rectangle r1=new  Rectangle();
        r1.area(2.0f, 3.0f);
    }
}
