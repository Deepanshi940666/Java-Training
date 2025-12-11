package lec16;

import java.io.File;
import java.util.Scanner;

public class smallProject {

    public static void main(String[] args) {
        System.out.println("Choose the no. :\n1.To Create new File\n2.To Write Data\n3.To Read Data\n4.To Delete File");
        System.out.print("enter a no. :");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {
            File file = new File("handling.java");
            try {
                if (file.createNewFile()) {
                    System.out.println("New file Created....." + file.getName());
                    System.out.println("New file Created....." + file.getAbsoluteFile());
                } else {
                    System.out.println("This file already exists....");
                }
            } catch (Exception e) {
                System.out.println("Sorry Something went wrong....");
            }
        }

    }
}
