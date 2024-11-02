public class Employee
{
    private double baseSalary;
    private double bonus;
    private double commissions;
    private String detail;

    public String getDetail() {
        return detail;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getCommissions() {
        return commissions;
    }

    public Employee(double baseSalary, String detail, double bonus, double commissions) {
        this.baseSalary = baseSalary;
        this.detail = detail;
        this.bonus = bonus;
        this.commissions = commissions;
    }

    public void calculateSalary()
    {
        System.out.println("this is the method mx+b*6");
    }
    public void getDetails()
    {
        System.out.println("details");
    }
    public void performTask()
    {
        System.out.println("task");
    }

}