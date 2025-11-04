import java.util.Scanner;
public class hello{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter int: ");
        int a=sc.nextInt();

        System.out.print("Enter Double: ");
        double b=sc.nextDouble();

        System.out.print("Enter String: ");
        String c=sc.next();
        sc.nextLine();

        System.out.print("Enter Line: ");
        String d=sc.nextLine();

        System.out.println("Integer: "+a);
        System.out.println("Double: "+b);
        System.out.println("String: "+c);
        System.out.println("Line: "+d);
    }
}