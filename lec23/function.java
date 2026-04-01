
import java.util.Scanner;


public class function{

    public static int frequency(int a, int b){
       int count=0, num;
       while(a!=0){
         num=a%10;
        
         if(num==b){
           count++;
         }
          a=a/10;
       }
       return count;
    }

    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a,b);
        System.out.println(sum);
        System.out.println(frequency(a, b));
    }
}
