package concrete;

/**
 *
 * @author Mary
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String jobTitle;
    private char payFrequency;

    public Employee(String firstName, String lastName, String jobTitle, char payFrequency, double totalPeriodPay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.payFrequency = payFrequency;
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

}
