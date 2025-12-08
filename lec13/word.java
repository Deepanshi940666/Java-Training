package lec13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public String toString(){
    return rollNo+""+name;
    }
}
class nameSort implements Comparator<Student>{
   public int compare(Student s1, Student s2){
    return s1.name.compareTo(s2.name);
   }

}

public class word {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Aarti", 365489));
        list.add(new Student("Aaru", 365689));
        list.add(new Student("vani", 365659));
        Collections.sort(list,new nameSort());
        for (Student s: list){
            System.out.println(s.rollNo+""+s.name);
        }
       

    }
}

