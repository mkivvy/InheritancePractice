package myconcrete;

/**
 *
 * @author Mary
 */
public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String firstName, String lastName, String jobTitle) {
        super(firstName, lastName, jobTitle, SEMIMONTHLY, SALARY_EMP);
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
