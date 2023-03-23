public class EmployeeTestC
{
    public static void main(String[] args)
    {
        Employee [] EmployeeList = new Employee[3];
        EmployeeList[0] = new Employee("Susan","Baker",2500);

        System.out.println("~~~Employee Details~~~");
        System.out.println();

        for(int i = 0; i < 3; i++)
        {
            EmployeeList[i] = new Employee("First","Last",6969);
            
            System.out.println("Employee " + (i+1));
            System.out.println();

            //Sets the name of employee.
            System.out.print("Please enter the name: ");
            EmployeeList[i].setEmployeeName(ES.nextString());

            //Sets the surname of employee.
            System.out.print("Please enter the surname: ");
            EmployeeList[i].setEmployeeSurname(ES.nextString());

            //Sets the salary of employee.
            System.out.print("Please enter the salary: ");
            EmployeeList[i].setEmployeeSalary(ES.nextDouble());
            System.out.println();
        }

        //Display information.
        details(EmployeeList);
        
        EmployeeList[0].setEmployeeSalary(3000);
        EmployeeList[1].setEmployeeSalary(3502);
        EmployeeList[2].setEmployeeSalary(5000);

        //Displaying the information.
        details(EmployeeList);

        EmployeeList[0].setEmployeeSurname("Murphy");
        EmployeeList[1].setEmployeeSurname("Kehoe");
        EmployeeList[2].setEmployeeSurname("Walsh");

        //Displaying the information.
        details(EmployeeList);
    }

    private static void details(Employee [] EmployeeList)
    {
        for(int i = 0; i < 3; i++)
        {  
            //Displaying the information.
            System.out.println("~~~Employee Salaries~~~");
            System.out.println();
            System.out.println("~~~Employee 1~~~");
            System.out.println("Name: " + EmployeeList[i].getEmployeeName());
            System.out.println("Surname: " + EmployeeList[i].getEmployeeSurname());
            System.out.println("Salary: " + EmployeeList[i].getEmployeeSalary());
            System.out.println();
        }
    }
}
