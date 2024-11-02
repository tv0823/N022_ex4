public class Manager extends Employee
{
    public Manager(int baseSalary, String details, int bonus, int commissions) {
        super(baseSalary, details, bonus*5, commissions*0.2);
    }

    @Override
    public void calculateSalary()
    {
        System.out.println("your salary is:" + super.getBaseSalary() + " + " + super.getBonus() + " - " + super.getCommissions() + " = "  + (super.getBaseSalary() + super.getBonus() - super.getCommissions()));
    }
    
    @Override
    public void getDetails()
    {
        System.out.println("Im a manager :" + super.getDetail());
    }

    @Override
    public void performTask()
    {
        System.out.println("managing the people to create a good app");
    }
}
