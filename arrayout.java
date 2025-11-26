import java.util.*;
public class arrayout {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many elements: ");
        int n = s.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a item: ");
            ar[i] = s.nextInt();
        }
        try{
            System.out.print("Enter index where to find the element: ");
            int i = s.nextInt();
            System.out.print("Element: "+ar[i]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is not found!!");
        }
        finally{
            System.out.println("Try block is executed!!");
        }
    }
}
