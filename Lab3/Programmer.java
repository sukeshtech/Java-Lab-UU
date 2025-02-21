public class Programmer extends Employee {
    private double basicPay;

    public Programmer(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    public void generatePaySlip() {
        double da = 0.97 * basicPay; // Dearness Allowance
        double hra = 0.10 * basicPay; // House Rent Allowance
        double pf = 0.12 * basicPay; // Provident Fund
        double staffClubFund = 0.001 * basicPay; // Staff Club Fund
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - (pf + staffClubFund);

        System.out.println("\n--- Programmer Pay Slip ---");
        displayDetails();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA (97%): " + da);
        System.out.println("HRA (10%): " + hra);
        System.out.println("PF (12%): " + pf);
        System.out.println("Staff Club Fund (0.1%): " + staffClubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}