public class bigWord {
    public static void main(String[] args) 
    {
       
        String str1="book copy pen pencil";
        String largest="";
        String a[]=str1.split(" ");
        for(String val:a){
        System.out.println(val);
        if(val.length()>largest.length()){
            largest=val;
        }
         }
     System.out.println("Largest word is "+largest);
}
}
