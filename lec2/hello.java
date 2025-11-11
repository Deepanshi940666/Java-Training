import java.util.Scanner;
class hello{
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
    System.out.println(str===str1);
    
    String str=new String("hello");
    String str1=new String("hello");
     System.out.println(str===str1);

}