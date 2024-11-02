public class Developer extends Employee
{
    public Developer(int baseSalary, String details, int bonus, int commissions) {
        super(baseSalary, details, bonus*2, commissions*0.3);
    }

    @Override
    public void calculateSalary()
    {
        System.out.println("your salary is:" + super.getBaseSalary() + " + " + super.getBonus() + " - " + super.getCommissions() + " = "  + (super.getBaseSalary() + super.getBonus() - super.getCommissions()));
    }

    @Override
    public void getDetails()
    {
        System.out.println("Im a developer :" + super.getDetail());
    }

    @Override
    public void performTask()
    {
        System.out.println("developing good app");
    }
}
