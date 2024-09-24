public class Developer extends Employee
{
    @Override
    public void calculateSalary()
    {
        System.out.println("your salary is:" + 1923 + " + " + 3009 + " - " + 8 + " = "  + (1923+3009-8));
    }

    @Override
    public void getDetails()
    {
        System.out.println("1097o");
    }

    @Override
    public void performTask()
    {
        System.out.println("developing good app");
    }
}
