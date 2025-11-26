import java.util.*;
class errorhandling extends Exception{
    public errorhandling(String msg){
        super(msg);
    }
}

public class withdrawl {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter balance: ");
        double b = s.nextDouble();
        System.out.print("Enter withdrawl amount: ");
        double w = s.nextDouble();
        try{
            if(w<0){
                throw new IllegalArgumentException("Amount can't be negative");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(w>b){
                    throw new errorhandling("Withdrawl can't be greater than balance!");
                }
                else{
                    b -= w;
                    System.out.println("Balance: "+b);
                }
            }
            catch(errorhandling e){
                System.out.println(e.getMessage());
            }
            finally{
                System.out.println("Try block is executed!!");
            }
        }
    }
}
