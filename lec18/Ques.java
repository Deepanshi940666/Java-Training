package lec18;

import java.util.ArrayList;
import java.util.List;

public class Ques {
    
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(); 
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(10);
        list.add(12);
        List<Integer>greater=list.stream().filter(n->n>5 && n%2!=0).toList();
        int data=greater.stream().reduce(0,(a,b)->a+b);
        System.out.println(data);
    }
}
