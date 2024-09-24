public class Manager extends Employee
{
    @Override
    public void calculateSalary()
    {
        System.out.println("your salary is:" + 123 + " + " + 30 + " - " + 6 + " = "  + (123+30-6));
    }
    
    @Override
    public void getDetails()
    {
        System.out.println("P0958j");
    }

    @Override
    public void performTask()
    {
        System.out.println("managing the people to create a good app");
    }
}
