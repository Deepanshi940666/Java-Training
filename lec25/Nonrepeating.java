package lec25;

public class Nonrepeating {
     public static void main(String[] args) {
        String str=new String("ede");
    
        //int count=0;
        char val='\0';
        
        for(int i=0;i<str.length()-1;i++){
             int count=0;
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
                
            }
            if(count==0){
                 val = str.charAt(i);
                break;

            }
            // else{
            //     System.out.println("invalid");
            // }
        }
        System.out.println(val);
    }
}
