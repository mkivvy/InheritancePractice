package concrete;

/**
 *
 * @author Mary
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double bonusAmt;

    public SalaryPlusBonusEmployee(String firstName, String lastName, String jobTitle) {
        super(firstName, lastName, jobTitle);
        this.bonusAmt = 0.0;
    }

    public double getBonusAmt() {
        return bonusAmt;
    }

    public void setBonusAmt(double bonusAmt) {
        this.bonusAmt = bonusAmt;
    }

    @Override
    public double calcPeriodPay() {
        double baseAmt = (getAnnualSalary() / 24);
        return (baseAmt + bonusAmt);
    }

}
