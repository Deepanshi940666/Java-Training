package lec16;

import java.io.FileWriter;


public class writing {
    static void WriteData(String data){
       try {
          FileWriter writer=new FileWriter("new.txt",true);  //true will append the new text with old text but without the true the text will get override on changing the data inside the file
          writer.write(data);
          writer.close(); 
       } catch (Exception e) {
         System.out.println(e);
       }
    }
    public static void main(String[] args) {
        WriteData("Lets learn the File Handling......");
    }
}
