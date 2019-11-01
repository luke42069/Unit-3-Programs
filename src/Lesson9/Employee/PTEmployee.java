
package Lesson9.Employee;


public class PTEmployee extends Employee{

    
    public PTEmployee(){
        super();
    }
    
    @Override
    public double getPay() {
        double pay = hours*rate;
        totalpay+=pay;
        return pay;
    }
    
}
