import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);  //10,20,30,40,50
        System.out.println(list.removeLast()); //remove the last value
        System.out.println(list.clone());  //10,20,30,40,50
        System.out.println(list.hashCode()); //fingerprint
        System.out.println(list.isEmpty());  //false
        System.out.println(list.get(3));  //show value of index 3
        System.out.println(list.getFirst());  //show the first value if LL is empty then it causes crash so do not use if the LL is empty 
        System.out.println(list.peekFirst()); //if the LL is empty then it will return null 
        System.out.println(list.poll());  //(front wala element delete + return)
        System.out.println(list);   //now the front wala element delete + return therefore list hass 20,30,40,50
        System.out.println(list.offer(80));//LL ke end (peeche) me ek element add karna. Agar add ho gaya toh true return karega. Agar add nahi kar paya toh false return karega.
        System.out.println(list.set(3, 99));//change element of that index
    }
}