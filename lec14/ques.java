package lec14;

import java.util.*;

public class ques {
    public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<>();
        list.add(-4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(-8);
        list.add(9);
        list.add(10);
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext()){
            Integer x=it.next();
            System.out.println(x);
        //  replace odd no by "-1"
        if(x<0){
           it.set((-1)*x);
        }
         System.out.println(list);  
        }       

}
}