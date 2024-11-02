public class Salesperson extends Employee
{

    public Salesperson(double baseSalary, String details, double bonus, double commissions) {
        super(baseSalary, details, bonus*1.5, commissions*0.4);
    }

    @Override
    public void calculateSalary()
    {
        System.out.println("your salary is:" + super.getBaseSalary() + " + " + super.getBonus() + " - " + super.getCommissions() + " = "  + (super.getBaseSalary() + super.getBonus() - super.getCommissions()));
    }

    @Override
    public void getDetails()
    {
        System.out.println("Im a salesperson :" + super.getDetail());
    }

    @Override
    public void performTask()
    {
        System.out.println("selling good app");
    }
}
