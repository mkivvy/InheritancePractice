package myinterface;

/**
 *
 * @author Mary
 */
public class SalariedEmployee implements Employee{
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

    private double annualSalary;

    public SalariedEmployee(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.annualSalary = 0.0;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
  
    public double calcPeriodPay() {
        return (annualSalary / 24.0);
    }

}
