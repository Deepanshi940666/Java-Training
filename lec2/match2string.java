import java.util.Arrays;
public class match2string {
    
    public static void main(String[] args) 
    {
       String str1="hello";
       String str2="heloo";
      char ch1 []=str1.toCharArray();
      char ch2 []=str2.toCharArray();
      Arrays.sort(ch1);
      Arrays.sort(ch2);
        String a= new String(ch1);
        String b= new String(ch2);
      if(a.equals(b)){
        System.out.println("true");
      }

      else{
         System.out.println("false");
      }


    }
}
