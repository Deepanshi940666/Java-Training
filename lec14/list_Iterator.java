package lec14;

import java.util.*;

public class list_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        ListIterator<Integer> it=list.listIterator();
//         while(it.hasNext()){
//             Integer x=it.next();
//             System.out.println(x);
//             // if(x==6){
//             //     // it.remove();  //remove the 6
//             //     // it.add(10);//add 10 after 6
//             //     it.set(10);//add 10 at 6
//             // }
//             //replace odd no by "-1"
//             // if(x%2!=0){
//             //  it.set(-1);
//             // }

//             //[1,2,3,4,5,6,7]
//             // while (it.()) {
//             //     Object elem =  it.next();
                
//             // }

//         }
//         while(it.hasPrevious()){
//             Integer y=it.previous();
//             System.out.println(y);
//             // if(y==6){
//             //     it.remove();
//             // }
//         }
//         System.out.println(list);
int ln=list.size();
int mid=ln/2;
 while(it.hasNext()&&it.nextIndex()<=mid){
            Integer x=it.next();
            System.out.println(x);  
 }
        

 while(it.hasPrevious()){
            Integer y=it.previous();
            System.out.println(y);
        }
        System.out.println(list);
 }
}

