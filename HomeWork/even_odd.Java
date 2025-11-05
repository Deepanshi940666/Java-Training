 import java.util.Scanner;
 class even_odd{
    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. :");
        int no= sc.nextInt();
        if(no%2==0){
            System.out.print("Even no");
        }
        else{
             System.out.print("Odd no");
        }
    }
} 