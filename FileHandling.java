import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileHandling{
    public static void main(String[] args) {
       
        //----File creation----
        File file1 = new File("file1.txt");
        try{ 
        file1.createNewFile();
        }
        catch(IOException e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
/*
        //------Write in a file----
        try{ 
        FileWriter file = new FileWriter("file1.txt");
        file.write("Hello Everyone\nWelcome to JAVA world");
        file.close();
        System.out.println("Your file updated");
        }
        catch(IOException e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        //-----Read the File------
        try{
            File myfile = new File("File1.txt");
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(IOException e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        //----File Deletion----
        File myfile = new File("File1.txt");
        if(myfile.delete()){
            System.out.println("File deleted successfully");
        }
        else{
            System.out.println("Unable to delete the file");
        }*/
    }
}