
class inbuiltFunct {
    public static void main(String[] args) 
    {
    String str="hello";
    String str1="hello";
    System.out.println(str.length());
    System.out.println(str.charAt(1));
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.trim());
    System.out.println(str.substring(2));
    System.out.println(str.substring(2,4));
    System.out.println(str.indexOf('h'));
    // System.out.println(str===str1);
    
    // String str=new String("hello");
    // String str1=new String("hello");
    //  System.out.println(str===str1);
     // spliting the array

     String str2="book copy pen pencil";
     String a[]=str2.split(" ");
     for(String val:a){
        System.out.println(val);
     }

     StringBuilder Name=new StringBuilder("Deeps");
     Name.append("Gupta");
     Name.insert(5,".....");      //to add more string at any index of given string
     System.out.println(Name);
     //3. replace()
     Name.replace(4, 6,"anshi");
      System.out.println(Name);

    //4. delete()
    Name.delete(9, 13);
     System.out.println(Name);

     //5.reverse()
     Name.reverse();
      // System.out.println(Name);

     //6.length()
     int length=Name.length();
      System.out.println(length);

    //7.capacity()
    int capacity=Name.capacity();
     System.out.println("capacity is:"+capacity);
}
}
