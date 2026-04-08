package lec25;

import java.util.Arrays;

public class anargram {
    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";
        int l1=str1.length();
        int l2=str2.length();

        char[] a= str1.toCharArray();
        char[] b= str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b)){
            System.out.println("Anagraam");
        }
        else{
            System.out.println("not ");
        }
    }     

}
