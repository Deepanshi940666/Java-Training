import java.util.Scanner;
public class vowel {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character :");
        char ch = sc.next().charAt(0);
        switch(ch){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
             case 'A':
             case 'E':
             case 'I':
             case 'O':
             case 'U':
                 System.out.print("Vowel");
                 break;
             default:
                 System.out.print("Consonant"); 
         
        }

    }
}