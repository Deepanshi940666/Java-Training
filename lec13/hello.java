package lec13;

import java.util.ArrayList;
import java.util.Collections;

 class Student implements Comparable<Student>{
    String name;
    int rollNo;
    public Student(String name, int rollNo) {
     this.name=name;
     this.rollNo=rollNo;
    }   
    public int compareTo(Student s1){ 
        return  this.rollNo-s1.rollNo;
    }
    // @Override new*
    public String toString(){
    return this.name+""+this.rollNo;
    }
}


public class hello {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Aarti", 365489));
        list.add(new Student("Aaru", 365689));
        list.add(new Student("vani", 365659));
        Collections.sort(list);
        System.out.println(list);

    }
}
