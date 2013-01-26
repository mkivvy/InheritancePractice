package myinterface;

/**
 *
 * @author Mary
 */
public interface Employee {
    public static final char BIWEEKLY = 'B';
    public static final char SEMIMONTHLY = 'S';
    public static final char MONTHLY = 'M';

    public String getFirstName();
    public String getLastName();
    public String getJobTitle();
    public char getPayFrequency();
    public void setFirstName(String firstName);
    public void setLastName(String lastName);
    public void setJobTitle(String jobTitle);
    public void setPayFrequency(char payFrequency);
    public double calcPeriodPay();
}
