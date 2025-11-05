// package HomeWork;
import java.util.Scanner;
public class greater2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two no. :");
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2){
            System.out.print("Greater no. is ");
            System.out.print(n1);
        }
        else{
             System.out.print("Greater no. is ");
             System.out.print(n2);
        }

    }
}
