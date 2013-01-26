package myinterface;

/**
 *
 * @author Mary
 */
public interface Employee {
    public static final char BIWEEKLY = 'B';
    public static final char SEMIMONTHLY = 'S';
    public static final char SALARY_EMP = 'S';
    public static final char HOURLY_EMP = 'H';
    public static final char SALARY_BONUS_EMP = 'B';

    public String getFirstName();
    public String getLastName();
    public String getJobTitle();
    public char getPayFrequency();
    public char getEmpType();
    public void setFirstName(String firstName);
    public void setLastName(String lastName);
    public void setJobTitle(String jobTitle);
    public void setPayFrequency(char payFrequency);
    public void setEmpType(char empType);
    public double calcPeriodPay();
}
