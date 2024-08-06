package Classwork;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
class File1
{
 public static void main(String[] args) 
 {
    try{
        File f= new File("data.txt");
        fileInputStream fout= new fileinputStream(f,true);
        String data = "java is architectural neutral";
        byte b[] = data.getBytes();
        fout.write(b);
        System.out.println("operation success......");
    }
   catch(IOException e)
   {   
    System.out.println(e);
    }
 }   
}

