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
    private double annualSalary;

    public SalariedEmployee(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.annualSalary = 0.0;
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

    public double getAnnualSalary() {
        return annualSalary;
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
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
  
    @Override
    public double calcPeriodPay() {
        return (annualSalary / 24.0);
    }

}
