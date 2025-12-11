package lec16;
import java.io.*;

public class delete {
    static void WriteData(String data){
       try {
          FileWriter writer=new FileWriter("new.txt",true);  //true will append the new text with old text but without the true the text will get override on changing the data inside the file
          writer.write(data);
          writer.close(); 
       } catch (Exception e) {
         System.out.println(e);
       }
    }

    static void readingData(){
        try {
            FileReader Reader=new FileReader("new.txt");
            int ch;
            while((ch=Reader.read())!=-1){
              System.out.print((char)ch);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void deleteData(){
        try{
            File file=new File("handling.java");
            if(file.delete()){
                System.out.println("File deleted Successfully...");
            }
            else{
                System.out.println("Not Deleted");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    
    public static void main(String[] args) {
        WriteData("Lets learn the File Handling......");
        readingData();
        deleteData();
    }
}
