public class frequency {
    public static void main(String[] args) 
    {
    int freq[]=new int[256];
    String str="hello";
 
    for(char ch : str.toCharArray()){
       freq[ch]++;
    }
 for(int i=0;i<256;i++){
    if(freq[i]>0){
        System.out.println((char)i+"="+freq[i]);
    }
 }
     }
}

