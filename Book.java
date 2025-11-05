import java.util.*;
class books{
    String name;
    String author;
    int num_of_pages;
    double price;
    public books(String name,String author,int num_of_pages,double price){
        this.name = name;
        this.author = author;
        this.num_of_pages = num_of_pages;
        this.price = price;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setuthor(String author){
        this.author = author;
    }
    public void setnum_of_pages(int num_of_pages){
        this.num_of_pages = num_of_pages;
    }
    public void setprice(double price){
        this.price = price;
    }
    public String getname(){
        return name;
    }
    public String getauthor(){
        return author;
    }
    public int getnum_of_pages(){
        return num_of_pages;
    }
    public double getprice(){
        return price;
    }
    public String toString(){
        return "Name: "+name+"Author: "+author+"No.of pages: "+num_of_pages+"Price: "+price;
    }
}
public class Book {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many books: ");
        int n = s.nextInt();
        s.nextLine();
        books[] b = new books[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter book name: ");
            String na = s.nextLine();
            System.out.print("Enter Author name: ");
            String au = s.nextLine();
            System.out.print("Enter no.of pages: ");
            int nu = s.nextInt();
            System.out.print("Enter price: ");
            double pr = s.nextDouble();
            s.nextLine();
            b[i] = new books(na,au,nu,pr);
        }
        for(books bo:b){
            System.out.println(bo.toString());
        }
    }
}
