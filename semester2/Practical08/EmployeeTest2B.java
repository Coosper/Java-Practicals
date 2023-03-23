public class EmployeeTest2B
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee(null,null,1);
        Employee employee2 = new Employee("Susan","Baker",2500);
        Employee employee3 = new Employee(null,null,1);
        
        System.out.println("Enter employee details 1");
        System.out.println();
        
        System.out.print("Please enter employee first name: ");
        employee1.setEmployeeName(ES.nextString());
        System.out.print("Please enter employee second name: ");
        employee1.setEmployeeSurname(ES.nextString());
        System.out.print("Please enter employee monthly salary: ");
        employee1.setEmployeeSalary(ES.nextDouble());
        
        System.out.println();
        System.out.println("Enter employee details 3");
        System.out.println();
        
        System.out.print("Please enter employee first name: ");
        employee3.setEmployeeName(ES.nextString());
        System.out.print("Please enter employee second name: ");
        employee3.setEmployeeSurname(ES.nextString());
        System.out.print("Please enter employee monthly salary: ");
        employee3.setEmployeeSalary(ES.nextDouble());
        
        System.out.println();
        System.out.println("~~~Employee Salaries~~~");
        System.out.println();
       
        details(employee1, employee2, employee3);
        
        System.out.println("Employee Yearly Salaries");
        System.out.println();
        
        System.out.println("Name: " + employee1.getEmployeeName());
        System.out.println("Surname: " + employee1.getEmployeeSurname());
        System.out.println("Yearly Salary: " + (employee1.getEmployeeSalary()*12));
        System.out.println();
        
        System.out.println("Name: " + employee1.getEmployeeName());
        System.out.println("Surname: " + employee1.getEmployeeSurname());
        System.out.println("Yearly Salary: " + (employee2.getEmployeeSalary()*12));
        System.out.println();
        
        System.out.println("Name: " + employee1.getEmployeeName());
        System.out.println("Surname: " + employee1.getEmployeeSurname());
        System.out.println("Yearly Salary: " + (employee3.getEmployeeSalary()*12));
        System.out.println();
        
        System.out.print("Please enter new second name: ");
        employee1.setEmployeeSurname(ES.nextString());
        System.out.print("Please enter new second name: ");
        employee2.setEmployeeSurname(ES.nextString());
        System.out.print("Please enter new second name: ");
        employee3.setEmployeeSurname(ES.nextString());
        
        System.out.println();
        System.out.println("~~~Employee New Names~~~");
        System.out.println();
       
        details(employee1, employee2, employee3);
    }
    
    private static void details(Employee employee1,Employee employee2,Employee employee3)
    {
        //Displaying the information.
        System.out.println("~~~Employee Salaries~~~");
        System.out.println();
        System.out.println("~~~Employee 1~~~");
        System.out.println("Name: " + employee1.getEmployeeName());
        System.out.println("Surname: " + employee1.getEmployeeSurname());
        System.out.println("Salary: " + employee1.getEmployeeSalary());
        System.out.println();
        
        System.out.println("~~~Employee 2~~~");
        System.out.println("Name: " + employee2.getEmployeeName());
        System.out.println("Surname: " + employee2.getEmployeeSurname());
        System.out.println("Salary: " + employee2.getEmployeeSalary());
        System.out.println();
        
        System.out.println("~~~Employee 3~~~");
        System.out.println("Name: " + employee3.getEmployeeName());
        System.out.println("Surname: " + employee3.getEmployeeSurname());
        System.out.println("Salary: " + employee3.getEmployeeSalary());
        System.out.println();
    }
}
