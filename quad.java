import java.util.*;
class quad{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x^2 coefficient: ");
        float a = s.nextFloat();
        System.out.print("Enter x coefficient: ");
        float b = s.nextFloat();
        System.out.print("Enter constant: ");
        float c = s.nextFloat();
        if(a==0){
            System.out.println("Equation is linear!!");
            float r1 = -c/b;
            System.out.println("Value of x is "+r1);
        }
        else{
            float d = (b*b) - (4*a*c);
            if(d>0){
                System.out.println("Equation has two real and distinct roots!");
                double r1 = ((-b) + Math.sqrt(d))/(2*a);
                double r2 = ((-b) - Math.sqrt(d))/(2*a);
                System.out.println("Roots are "+r1+" and "+r2);
            }
            else if(d==0){
                System.out.println("Equation has two real and equal roots!");
                float r1 = (-b)/(2*a);
                System.out.println("Roots are "+r1+" and "+r1);
            }
            else{
                System.out.println("Equation has imaginary roots!");
            }
        }
    }
}