// Q2. Employee Salary Management
// Create an Employee class with id, name and salary.
// - Create 5 employee objects.
// - Increase every employee's salary by 10%.
// - Find the employee with the highest salary.
// - Print employees whose salary is above 50000.
class employee{
    int id;
    String name;
    int salary;
}
public class employSalaryManagement {
    public static void main(String[] args) {
        employee[] emp = new employee[3];
        emp[0] = new employee();
        emp[0].id = 1;
        emp[0].name = "shubham";
        emp[0].salary = 500000;

        emp[1] = new employee();
        emp[1].id = 2;
        emp[1].name = "rohit";
        emp[1].salary = 36389;

        emp[2] = new employee();
        emp[2].id = 3;
        emp[2].name = "gaurav";
        emp[2].salary  = 43663;

        employee higestSalary = emp[0];

        for(employee e : emp){
            
            e.salary = (int) (e.salary * 1.10);

            if(e.salary > higestSalary.salary){
                higestSalary = e;
                
            }

            if(e.salary > 50000){
                System.out.println(e.name +" has greater salary than 50000");
            }
            
        }

        System.out.println(higestSalary.name +" is the empolye with higest salary " + higestSalary.salary);


    }
    
}
