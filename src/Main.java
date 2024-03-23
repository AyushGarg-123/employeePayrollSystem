import java. util. Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        PayrollSystem payrollSystem = new PayrollSystem();
        System.out.println("Enter number of full time employees you want to enter");
        int n=scan.nextInt();
        if(n>0){
            System.out.println("Enter details as first_name last_name id monthly_salary");
        }
        for(int i=0;i<n;i++) {
            System.out.println("Enter details of Full time employee "+(i+1));
            FullTimeEmployee emp = new FullTimeEmployee(scan.next() + " " + scan.next(), scan.nextInt(), scan.nextInt());
            payrollSystem.addEmployee(emp);
        }
        if(n>0) {
            System.out.println("All full time employees added successfully");
        }
        System.out.println("Enter number of part time employees you want to enter");
        int m=scan.nextInt();
        if(m>0){
            System.out.println("Enter details as first_name last_name id hours_worked hourly_rate");
        }
        for(int i=0;i<m;i++) {
            System.out.println("Enter details of Part time employee "+(i+1));
            PartTimeEmployee emp = new PartTimeEmployee(scan.next() + " " + scan.next(), scan.nextInt(), scan.nextInt(),scan.nextInt());
            payrollSystem.addEmployee(emp);
        }
        if(m>0){
        System.out.println("All part time employees added successfully");
        }
        System.out.println("Initial Employee Details:");
        payrollSystem.displayEmployees();
        System.out.println("Enter number of employees you want to remove");
        int r=scan.nextInt();
        for(int i=0;i<r;i++) {
            System.out.println("Enter id of employee "+(i+1)+" you want to remove");
            payrollSystem.removeEmployee(scan.nextInt());
        }
        if(r>0) {
            System.out.println("Removed employees");
        }
        System.out.println("\nRemaining Employee Details:");
        payrollSystem.displayEmployees();
    }
}