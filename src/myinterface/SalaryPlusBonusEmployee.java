package myinterface;

/**
 *
 * @author Mary
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee implements Employee{
    private boolean payoutBonus;
    private double bonusAmt;

    public SalaryPlusBonusEmployee(String firstName, String lastName, String jobTitle) {
        super(firstName, lastName, jobTitle);
        this.payoutBonus = false;
        this.bonusAmt = 0.0;
    }

    public boolean isPayoutBonus() {
        return payoutBonus;
    }

    public double getBonusAmt() {
        return bonusAmt;
    }

    public void setPayoutBonus(boolean payoutBonus) {
        this.payoutBonus = payoutBonus;
    }

    public void setBonusAmt(double bonusAmt) {
        this.bonusAmt = bonusAmt;
    }

    @Override
    public double calcPeriodPay() {
        if (payoutBonus) {
            payoutBonus = false; //reset payout status
            double baseAmt = (getAnnualSalary() / 24);
            return (baseAmt + bonusAmt);
        } else {
            return (getAnnualSalary() / 24);
        }

    }
}
