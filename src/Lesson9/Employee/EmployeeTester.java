
package Lesson9.Employee;


public class EmployeeTester {

    
    public static void main(String[] args) {
        Employee x = new FTEmployee();
        Employee y = new PTEmployee();
        
        x.setName("Bob");
        y.setName("Joe");
        x.setHours(55);
        y.setHours(55);
        x.setRate(20);
        y.setRate(20);
        
        System.out.format("%s's pay is %.2f",x.getName(),x.getPay());
        System.out.format("\n%s's pay is %.2f",y.getName(),y.getPay());
        System.out.format("\nTotal pay is %.2f",Employee.getTotalPay());
    }
    
}
