package lec22;
class node{
     int data;
     node next;
     node(int data){
        this.data=data;
        this.next=null;
     }
}
class MyLinkedList{
    node head;
    void createNode(int data){
       node newNode=new node(data);
       newNode.next=head;
       head=newNode;
    }
    
    void insertAtLast(int data){
        node newNode=new node(data);
        if(head==null){
            head=newNode;
        }
        node temp=head;
        while (temp.next!=null){
            temp=temp.next;
            
        }
        temp.next=newNode;
    }
    void deleteLast(){
        node temp=head;
        if(temp==null){
            return;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    
    void addNode(int val,int data){
        node temp=head;
        node ttemp;
        while(temp.data!=val){
            temp=temp.next;
            ttemp=temp.next;
            node newNode=new node(data);
            temp.next=newNode;
            newNode.next=ttemp;
        }
    }

    void display(){
       node temp=head;
       while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
       }
       System.out.println("null");
    }
    
}

public class linkedL {
    public static void main(String[] args) {
       MyLinkedList obj= new MyLinkedList();
       obj.createNode(10);
       obj.createNode(20);
       obj.insertAtLast(30);
       obj.insertAtLast(40);
       obj.insertAtLast(50);
       obj.deleteLast();
       obj.addNode(10, 45);
       obj.display();
    }
}
