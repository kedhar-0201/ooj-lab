import java.util.*;
class acc{
    Scanner s = new Scanner(System.in);
    private int accno;
    private double bal;
    public void setaccnum(){
        System.out.print("Enter Account no: ");
        accno = s.nextInt();
    }
     public void setbala() {
        System.out.print("Enter balance: ");
        double b = s.nextDouble();
        if (b > 0) {
            bal = b;
        } else {
            System.out.println("Invalid balance!");
        }
    }
    public void setbala(double b){
        if(b>0){
            bal = b;
        }
        else{
            System.out.println("Invalid ballance!");
        }
    }
    public int getaccnum(){
        return accno;
    }
    public double getbala(){
        return bal;
    }
}
public class account{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        acc a1 = new acc();
        a1.setaccnum();
        a1.setbala();
        double am;
        System.out.print("Enter amount to add: ");
        am = s1.nextDouble();
        if(am>0 && am!=0){
            double newbal = a1.getbala()+am;
            a1.setbala(newbal);
        }
        else{
            System.out.println("Invalid amount!");
        }
        System.out.println("Account no:"+a1.getaccnum());
        System.out.println("Balance:"+a1.getbala());
    }
}
