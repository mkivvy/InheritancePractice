package myabstract;

import java.text.DecimalFormat;

/**
 *
 * @author Mary
 */
public class TestAbstract {

        Employee[] empList = new Employee[6]; //2 salray, 2 hourly, 2 bonus

        //populate salary emps
        SalariedEmployee s1 = new SalariedEmployee("Helena", "Handbasket", "Theatre Manager");
        s1.setEmpType('S');
        s1.setPayFrequency('S');
        s1.setAnnualSalary(75000.00);
        empList[0] = s1;
        SalariedEmployee s2 = new SalariedEmployee("Rayne", "Bow", "Lighting Manager");
        s2.setEmpType('S');
        s2.setPayFrequency('S');
        s2.setAnnualSalary(100000.00);
        empList[1] = s2;

        //populate hourly emps
        HourlyEmployee h1 = new HourlyEmployee("Anna", "Lyze", "Dancer");
        h1.setHourlyRate(20.00);
        h1.setHoursWorked(100.0);
        empList[2] = h1;
        HourlyEmployee h2 = new HourlyEmployee("Cat", "Arwall", "Singer");
        h2.setHourlyRate(22.00);
        h2.setHoursWorked(80.0);
        empList[3] = h2;

        //populate salary plus bonus emps
        SalaryPlusBonusEmployee b1 = new SalaryPlusBonusEmployee("Bob", "Fosse", "Choreographer");
        b1.setEmpType('B');
        b1.setPayFrequency('S');
        b1.setAnnualSalary(200000.00);
        b1.setPayoutBonus(true);
        b1.setBonusAmt(3000.00);
        empList[4] = b1;
        SalaryPlusBonusEmployee b2 = new SalaryPlusBonusEmployee("Ima", "Good", "Artistic Director");
        b2.setEmpType('B');
        b2.setPayFrequency('S');
        b2.setAnnualSalary(150000.00);
        b2.setPayoutBonus(false);
        empList[5] = b2;

        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        for (Employee emps : empList) {
            System.out.println("--------------------------------------");
            System.out.println("Name: " + emps.getLastName()
                    + ", " + emps.getFirstName());
            System.out.println("Job Title: " + emps.getJobTitle());
            if (emps instanceof SalaryPlusBonusEmployee) {
                System.out.println("Employee is SALARY + BONUS");
                SalaryPlusBonusEmployee empBon = (SalaryPlusBonusEmployee) emps;
                System.out.println("Annual Salary: $"
                        + dollar.format(empBon.getAnnualSalary()));
                System.out.println("Bonus Amount: $"
                        + dollar.format(empBon.getBonusAmt()));
                System.out.println("Pay Period Amount: $"
                        + dollar.format(empBon.calcPeriodPay()));
            } else if (emps instanceof SalariedEmployee) {
                System.out.println("Employee is SALARIED");
                SalariedEmployee empSal = (SalariedEmployee) emps;
                System.out.println("Annual Salary: $"
                        + dollar.format(empSal.getAnnualSalary()));
                System.out.println("Pay Period Amount: $"
                        + dollar.format(empSal.calcPeriodPay()));
            } else if (emps instanceof HourlyEmployee)  {
                System.out.println("Employee is HOURLY");
                HourlyEmployee empHour = (HourlyEmployee) emps;
                System.out.println("Hourly Rate: "
                        + dollar.format(empHour.getHourlyRate()));
                System.out.println("Hours Worked: " + empHour.getHoursWorked());
                System.out.println("Pay Period Amount: $"
                        + dollar.format(empHour.calcPeriodPay()));
            }
        }
    }
}
