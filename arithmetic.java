import java.util.*;
public class arithmetic {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        System.out.print("Enter another number: ");
        int b = s.nextInt();
        try{
            double c = a/b;
            System.out.println("Result: "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Division with Zero is not possible!");
        }
        finally{
            System.out.println("Try block is executed!");
        }
    }
}
