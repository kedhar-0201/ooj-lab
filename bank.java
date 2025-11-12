import java.util.*;
class account{
    String name;
    int accno;
    String typeacc;
    double bal;
    public account(String name, int accno,String typeacc,double bal){
        this.name = name;
        this.accno = accno;
        this.typeacc = typeacc;
        this.bal = bal;
    }
    public void deposit(double amount){
        if(amount>0){
            bal = bal+amount;
            System.out.println("Updated balance: "+bal);
        }
        else{
            System.out.println("Invalid deposit");
        }
    }
    public void display(){
        System.out.println("Customer name: "+name);
        System.out.println("Account no: "+accno);
        System.out.println("Account type: "+typeacc);
        System.out.println("Balance: "+bal);
    }
    public void withdraw(double amount){
        if(amount>0 && amount<= bal){
            bal = bal-amount;
            System.out.println("Balance: "+bal);
        }
        else{
            System.out.println("Invalid withdrawl");
        }
    }
}
class savings extends account{
    double interest;
    public savings(String name,int accno,double bal,double interest){
        super(name,accno,"Savings",bal);
        this.interest = interest;
    }
    public void interestrate(int time){
        double interestrate = bal*Math.pow((1+interest/100),time) - bal;
        bal = bal+interestrate;
        System.out.println("InterestRate: "+interestrate+" Balance: "+bal);
    }
    @Override
    public void withdraw(double amount){
        if(amount>0 && amount<= bal){
            bal = bal-amount;
            System.out.println("Balance: "+bal);
        }
        else{
            System.out.println("Invalid withdrawl");
        }
    }
}
class current extends account{
    double min_bal = 100.00;
    double ser_charge = 100.00;
    public current(String name,int accno,double bal){
        super(name,accno,"Current",bal);
    }
    public void checkbal(){
        if(bal<min_bal){
            bal = bal-ser_charge;
            System.out.println("Balance below minimum.Service Cahrge imposed.Balance: "+bal);
        }
    }
    public void withdrawl(double amount){
        if(amount>0 && amount<= bal){
            bal = bal-amount;
            checkbal();
            System.out.println("Balance: "+bal);
        }
        else{
            System.out.println("Invalid withdrawl");
        }
    }
}
public class bank {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.print("Enter customer name: ");
        String name = s.nextLine();

        System.out.print("Enter account number: ");
        int accno = s.nextInt();

        System.out.println("Select Account Type:\n1. Savings Account\n2. Current Account");
        int type = s.nextInt();
        account acc = null;
        if (type == 1) {
            System.out.print("Enter initial balance: ");
            double bal = s.nextDouble();
            System.out.print("Enter annual interest rate (%): ");
            double rate = s.nextDouble();
            acc = new savings(name, accno, bal, rate);
        } else if (type == 2) {
            System.out.print("Enter initial balance: ");
            double bal = s.nextDouble();
            acc = new current(name, accno, bal);
        } else {
            System.out.println("Invalid account type!");
            System.exit(0);
        }
        System.out.println("\n--- Banking Menu ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display Balance");
        System.out.println("4. Compute and Deposit Interest");
        System.out.println("0. Exit");
        do{
            System.out.print("Enter your choice: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    acc.deposit(s.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    acc.withdraw(s.nextDouble());
                    break;
                case 3:
                    acc.display();
                    break;
                case 4:
                    if (acc instanceof savings) {
                        System.out.print("Enter number of years: ");
                        ((savings) acc).interestrate(s.nextInt());
                    } else {
                        System.out.println("Invalid option for current account.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
        }
    }