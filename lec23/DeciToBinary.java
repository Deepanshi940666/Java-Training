
import java.util.Scanner;

public class DeciToBinary {
    public static int Conversion(int a){
        int num;
        int val=0;
        int rem=0;
        while(a!=0){
         int quo= a/2;
         num=quo%10;
         rem=a%2;
         if(num%2==0){
            val=0;
            System.out.println(val);
         }
         else{
            val=1;
            System.out.println(val);
         }
         a=a/2;
        }
        System.out.println(rem);
        return val;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(Conversion(a));
    }
}
