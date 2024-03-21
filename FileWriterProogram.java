import java.io.File;
import java.io.FileWriter;
import java.io.IOExeption;

class FileCreation {
    public static void main(String[] args) {
File textFile = New File("main.text");

 try{
    FileWriter writer = New FileWriter(textFile);
    Writer.write(str:"Konichiwa");
 writer.close();
  System.out.println(x:"Printed successfully");
 } { catch (Exception e) {

 System.ut.println(x: "error detected");
 e.printStackTrace(;)

 }


    }
}