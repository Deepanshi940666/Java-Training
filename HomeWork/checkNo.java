package HomeWork;
import java.util.Scanner;
public class checkNo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. :");
        int no= sc.nextInt();
        if(no>0){
            System.out.print("positive no");
        }
        else if(no<0){
            System.out.print("Negative no"); 
        }
        else{
             System.out.print("Zero");
        }

    }
}
