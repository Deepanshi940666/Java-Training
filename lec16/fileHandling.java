package lec16;
import java.io.File;

public class fileHandling{
    //crud
    public static void main(String[] args) {
        File file=new File("handling.java");
        try {
            if(file.createNewFile()){
                System.out.println("New file Created....."+file.getName());
                System.out.println("New file Created....."+file.getAbsoluteFile());
            }
            else{
                System.out.println("This file already exists....");
            }
        } catch (Exception e) {
            System.out.println("Sorry Something went wrong....");
        }
    }
}
