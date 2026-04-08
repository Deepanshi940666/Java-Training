package lec25;

public class compressed {
    public static void main(String[] args) {
        String str=new String("aabbbcc");
        int i=0;
        int count=1;
        String ans=" ";
        while(i<str.length()){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                ans = ans + str.charAt(i)+count;
                count=1;
                System.out.println(ans);
            }
        }
    }
}
