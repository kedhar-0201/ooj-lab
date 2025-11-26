import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class filenot {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String name = s.nextLine();
        FileInputStream content = null;
        try{
            content = new FileInputStream(name);
            System.out.println("File is found!!");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!!");
        }
        finally{
            System.out.println("Try block is executed!!");
        }
    }
}
