
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int small= arr[0];
        int greater = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > greater){
               greater = arr[i];
            }
            else if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println(" ");
        System.out.println(greater);
        System.out.println(small);

        int span= greater - small;
        System.out.println(span);
    }
}
