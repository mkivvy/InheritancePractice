package myabstract;

/**
 *
 * @author Mary
 */
public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String jobTitle) {
        super(firstName, lastName, jobTitle);
        this.hourlyRate = 0.0;
        this.hoursWorked = 0.0;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
   public double calcPeriodPay() {
       return (hourlyRate * hoursWorked);
   } 
}
