package myabstract;

/**
 *
 * @author Mary
 */
public abstract class Employee {

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

    public Employee(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.payFrequency = BIWEEKLY; //default to bi-weekly
        this.empType = HOURLY_EMP; //default to hourly
    }

    public Employee(String firstName, String lastName, String jobTitle,
            char payFrequency, char empType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.payFrequency = payFrequency;
        this.empType = empType;
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

    public char getEmpType() {
        return empType;
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

    public void setEmpType(char empType) {
        this.empType = empType;
    }
    
    public abstract double calcPeriodPay();
}
