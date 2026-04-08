package lec25;

public class string {
    public static void main(String[] args) {
        String str1="mam";
        String str2="Hii";
        String str3=new String("Hello");
        boolean val= str2.equals(str3);
        System.out.println(val);
        System.out.println(str1.substring(0,2));
        // System.out.println(str1.charAt(1));
        for(int i=0; i<str1.length();i++){
            System.out.println(str1.charAt(i));
        }
        String rev="";
        for(int i=str1.length()-1; i>=0; i--){
            System.out.println(str1.charAt(i));
            rev=rev+ str1.charAt(i);
           
        }
        System.out.println(rev);
        if(str1.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");

        }
        // System.out.println(str1.contains("hii"));
        // System.out.println(str1.contains(str3));
    }
}
