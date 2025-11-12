package lec6;

 public class details{
   
    String name;
    int rollno;
    double marks;
    void disp(){
        System.out.println("name:"+name);
        System.out.println("rollno:"+rollno);
        System.out.println("marks:"+marks);

    }
    
}

 class student {
    public static void main(String[] args) {
        details s1=new details();
        s1.name="Deepanshi";
        s1.rollno=23456;
        s1.marks=80;
        details s2=new details();
        s2.name="Riya";
        s2.rollno=23457;
        s2.marks=89;
        details s3=new details();
        s3.name="Deeps";
        s3.rollno=23458;
        s3.marks=76;
        s1.disp();
        s2.disp();
        s3.disp();
    }
}
