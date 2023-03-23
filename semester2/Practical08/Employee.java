public class Employee
{
    private String name;
    private String surname;
    private double salary;
    
    public Employee(String nameIn, String surnameIn, double salaryIn)
    {
        name = nameIn;
        surname = surnameIn;
        salary = salaryIn;
    }
    
    //Method to set the name.
    public void setEmployeeName(String nameIn)
    {
        name = nameIn;
    }
    
    //Method to set the surname.
    public void setEmployeeSurname(String surnameIn)
    {
        surname = surnameIn;
    }
    
    //Method to set the salary.
    public void setEmployeeSalary(double salaryIn)
    {
        salary = salaryIn;
    }
    
    //Method to get the name.
    public String getEmployeeName()
    {
        return name;
    }
    
    //Method to get the surname.
    public String getEmployeeSurname()
    {
        return surname;
    }
    
    //Method to get the salary.
    public double getEmployeeSalary()
    {
        return salary;
    }
}
