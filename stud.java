import java.util.Scanner;
class stud {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        String na = "";
        String usn = "";
        int n;
        System.out.print("Enter how many subjects: ");
        n = s.nextInt();
        s.nextLine();
        int[] cred = new int[n];
        int[] mar = new int[n];
        na = nameinput(na);
        usn = usninput(usn);
        input(cred,mar,n);
        double sgpa = calu(cred,mar,n);
        disp(na,usn,cred,mar,n,sgpa);
    }
    static String nameinput(String na){
        System.out.print("Enter Student name: ");
        return s.nextLine();
    }
    static String usninput(String usn){
        System.out.print("Enter USN: ");
        return s.nextLine();
    }
    static void input(int[] cred,int[] mar,int n){
        for(int i=0;i<n;i++){
            System.out.print("Enter credits for subject "+(i+1)+":");
            cred[i] = s.nextInt();
            System.out.print("Enter marks for subject "+(i+1)+":");
            mar[i] = s.nextInt();
        }
    }
    static void disp(String na,String usn,int[] cred,int[] mar,int n,double sgpa){
        System.out.println("Student name:"+na);
        System.out.println("Student USN: "+usn);
        for(int i=0;i<n;i++){
            System.out.println("Credits for subject "+(i+1)+":"+cred[i]);
            System.out.println("Marks for subject"+(i+1)+":"+mar[i]);
        }
        System.out.println("SGPA: "+sgpa);
    }
    static double calu(int[] cred,int[] mar,int n){
        int tot = 0;
        int totcr = 0;
        int[] gr = new int[n];
        for(int i=0;i<n;i++){
            if(mar[i]>=90 && mar[i]<=100){
                gr[i] = 10;
            }
            else if(mar[i]>=80 && mar[i]<=89){
                gr[i] = 9;
            }
            else if(mar[i]>=70 && mar[i]<=79){
                gr[i] = 8;
            }
            else if(mar[i]>=60 && mar[i]<=69){
                gr[i] = 7;
            }
            else if(mar[i]>=50 && mar[i]<=59){
                gr[i] = 6;
            }
            else if(mar[i]>=40 && mar[i]<=49){
                gr[i] = 5;
            }
            else if(mar[i]>=0 && mar[i]<=39){
                gr[i] = 0;
            }
            tot += cred[i]*gr[i];
            totcr += cred[i]; 
        }
        return (double) tot/totcr;
    }
}
