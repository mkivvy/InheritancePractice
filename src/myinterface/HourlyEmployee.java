package myinterface;

/**
 *
 * @author Mary
 */
public class HourlyEmployee implements Employee {
    private String firstName;
    private String lastName;
    private String jobTitle;
    private char payFrequency; //B=bi-weekly, S=semi-monthly
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.payFrequency = BIWEEKLY;
        this.hourlyRate = 0.0;
        this.hoursWorked = 0.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public char getPayFrequency() {
        return payFrequency;
    }

   public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPayFrequency(char payFrequency) {
        this.payFrequency = payFrequency;
    }

     public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    @Override
   public double calcPeriodPay() {
       return (hourlyRate * hoursWorked);
   } 

}
