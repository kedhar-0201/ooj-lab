class emp{
    int emp_id;
    String emp_name;
    double salary;
    public emp(int a, String b,double c){
        emp_id = a;
        emp_name = b;
        salary = c;
    }
    public void display(){
        System.out.println("Employee id:"+emp_id);
        System.out.println("Employee Name:"+emp_name);
        System.out.println("Salary:"+salary);
    }
}
class employee{
    public static void main(String[] args){
        emp e1 = new emp(101,"John",50000);
        e1.display();
    }
}