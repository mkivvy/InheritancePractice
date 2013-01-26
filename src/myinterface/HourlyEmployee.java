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
    private char empType;  //S=salary, H=hourly, B=salary+bonus
    public static final char BIWEEKLY = 'B';
    public static final char SEMIMONTHLY = 'S';
    public static final char SALARY_EMP = 'S';
    public static final char HOURLY_EMP = 'H';
    public static final char SALARY_BONUS_EMP = 'B';

    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
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
    
    @Override
   public double calcPeriodPay() {
       return (hourlyRate * hoursWorked);
   } 

}
