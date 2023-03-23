public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Cedric","Ciobanu",1969);
        Employee employee2 = new Employee("Radaghan","Conagher",2001);
        Employee employee3 = new Employee("Bob","Jones",1000);
        
        System.out.println("~~~Employee Details~~~");
        System.out.println();
        
        System.out.println("Employee 1");
        System.out.println();
        
        //Sets the name of employee1.
        System.out.print("Please enter the name: ");
        employee1.setEmployeeName(ES.nextString());
        
        //Sets the surname of employee1.
        System.out.print("Please enter the surname: ");
        employee1.setEmployeeSurname(ES.nextString());
        
        //Sets the salary of employee1.
        System.out.print("Please enter the salary: ");
        employee1.setEmployeeSalary(ES.nextDouble());
        
        //Employee2
        System.out.println();
        System.out.println("Employee 2");
        System.out.println();
        
        //Sets the name of employee2.
        System.out.print("Please enter the name: ");
        employee2.setEmployeeName(ES.nextString());
        
        //Sets the surname of employee2.
        System.out.print("Please enter the surname: ");
        employee2.setEmployeeSurname(ES.nextString());
        
        //Sets the salary of employee2.
        System.out.print("Please enter the salary: ");
        employee2.setEmployeeSalary(ES.nextDouble());
        System.out.println();
        
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
        
        employee1.setEmployeeSalary(3000);
        employee2.setEmployeeSalary(3502);
        employee3.setEmployeeSalary(5000);
        
        //Displaying the information.
        System.out.println("~~~New Employee Salaries~~~");
        System.out.println();
        System.out.println("~~~New Employee 1 Salary~~~");
        System.out.println("Name: " + employee1.getEmployeeName());
        System.out.println("Surname: " + employee1.getEmployeeSurname());
        System.out.println("Salary: " + employee1.getEmployeeSalary());
        System.out.println();
        
        System.out.println("~~~New Employee 2 Salary~~~");
        System.out.println("Name: " + employee2.getEmployeeName());
        System.out.println("Surname: " + employee2.getEmployeeSurname());
        System.out.println("Salary: " + employee2.getEmployeeSalary());
        System.out.println();
        
        System.out.println("~~~New Employee 3 Salary~~~");
        System.out.println("Name: " + employee3.getEmployeeName());
        System.out.println("Surname: " + employee3.getEmployeeSurname());
        System.out.println("Salary: " + employee3.getEmployeeSalary());
        System.out.println();
        
        employee1.setEmployeeSurname("Murphy");
        employee2.setEmployeeSurname("Kehoe");
        employee3.setEmployeeSurname("Walsh");
        
        //Displaying the information.
        System.out.println("~~~New Employee Names~~~");
        System.out.println();
        
        System.out.println("~~~New Employee 1 Name~~~");
        System.out.println("Name: " + employee1.getEmployeeName());
        System.out.println("Surname: " + employee1.getEmployeeSurname());
        System.out.println("Salary: " + employee1.getEmployeeSalary());
        System.out.println();
        
        System.out.println("~~~New Employee 2 Name~~~");
        System.out.println("Name: " + employee2.getEmployeeName());
        System.out.println("Surname: " + employee2.getEmployeeSurname());
        System.out.println("Salary: " + employee2.getEmployeeSalary());
        System.out.println();
        
        System.out.println("~~~New Employee 3 Name~~~");
        System.out.println("Name: " + employee3.getEmployeeName());
        System.out.println("Surname: " + employee3.getEmployeeSurname());
        System.out.println("Salary: " + employee3.getEmployeeSalary());
        System.out.println();
    }
}
