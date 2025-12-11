package lec14;

import java.util.*;

public class ques1 {
       public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(5);
        list.add(6);
        list.add(12);
        list.add(67);
        list.add(3);
        list.add(10);
        ListIterator<Integer> it=list.listIterator();
        int target=12;
        while(it.hasNext() && it.next()==target){
           break;
        }
        while(it.hasPrevious()){
            Integer y=it.previous();
            if(y<target){
                it.remove();
            }
            System.out.println(y);
           
        }
        System.out.println(list); 
 }  

}

