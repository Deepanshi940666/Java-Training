// package HomeWork;
import java.util.Scanner;
public class sumN_num {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. :");
        int n= sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum+=i;
            i++;
        }
System.out.print(sum);
    }
}