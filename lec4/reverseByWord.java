public class reverseByWord {
      public static void main(String[] args) 
    {
       
        String str1="book copy pen pencil";
        String a[]=str1.split(" ");
        for(String val:a){
        // System.out.println(val);
        StringBuilder str= new StringBuilder(val);
        str.reverse();
        System.out.print(str.append(" ")); 

       }
}
}

