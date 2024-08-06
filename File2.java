package Classwork;

import java.io.FileWriter;
import java.util.Scanner;

class File2 {
  public static void main(String[] args) {
    try( FileWriter fw = new FileWriter("abc.txt"))
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter some text");
        String data = sc.nextLine();
        fw.write(data);
        System.out.println("Operation success.........");
        sc.close();
    }
    catch(java.io.IOException e)
    {
        e.printStackTrace();
    }
  }    
}
