public class EmployeeTest2C
{
    public static void main(String[] args)
    {
        Employee [] EmployeeList = new Employee[3];
        EmployeeList[1] = new Employee("Susan","Baker",2500);

        System.out.println("Enter employee details");
            System.out.println();

        for(int i = 0; i < 3; i++)
        {
            EmployeeList[i] = new Employee("First","Last",6969);
            EmployeeList[1] = new Employee("Susan","Baker",2500);
            if (i == 1) {
                continue; // skip the second iteration
            }

            System.out.print("Please enter employee first name: ");
            EmployeeList[i].setEmployeeName(ES.nextString());
            System.out.print("Please enter employee second name: ");
            EmployeeList[i].setEmployeeSurname(ES.nextString());
            System.out.print("Please enter employee monthly salary: ");
            EmployeeList[i].setEmployeeSalary(ES.nextDouble());
        }

        //Displays the employee details.
        System.out.println();
        System.out.println("~~~Employee Salaries~~~");
        System.out.println();
        details(EmployeeList);

        System.out.println("Employee Yearly Salaries");
        System.out.println();

        yearlySalary(EmployeeList);

        for(int i = 0; i < 3; i++)
        {
            System.out.print("Please enter new second name: ");
            EmployeeList[i].setEmployeeSurname(ES.nextString());
        }

        System.out.println();
        System.out.println("~~~Employee New Names~~~");
        System.out.println();

        details(EmployeeList);
    }

    private static void details(Employee [] EmployeeList)
    {
        for(int i = 0; i < 3; i++)
        { 
            //Displaying the information.
            System.out.println();
            System.out.println("~~~Employee 1~~~");
            System.out.println("Name: " + EmployeeList[i].getEmployeeName());
            System.out.println("Surname: " + EmployeeList[i].getEmployeeSurname());
            System.out.println("Salary: " + EmployeeList[i].getEmployeeSalary());
            System.out.println();
        }
    }

    private static void yearlySalary(Employee [] EmployeeList)
    {
        for(int i = 0; i < 3; i++)
        { 
            System.out.println("Name: " + EmployeeList[i].getEmployeeName());
            System.out.println("Surname: " + EmployeeList[i].getEmployeeSurname());
            System.out.println("Yearly Salary: " + (EmployeeList[i].getEmployeeSalary()*12));
            System.out.println();
        }
    }
}
