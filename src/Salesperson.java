public class Salesperson extends Employee
{
    @Override
    public void calculateSalary()
    {
        System.out.println("your salary is:" + 109873 + " + " + 757 + " - " + 6000 + " = "  + (109873+757-6000));
    }

    @Override
    public void getDetails()
    {
        System.out.println("o10");
    }

    @Override
    public void performTask()
    {
        System.out.println("selling good app");
    }
}
