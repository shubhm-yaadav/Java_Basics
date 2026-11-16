// --------------------------------------------------
// QUESTION 1: Employee Payroll System
// --------------------------------------------------
// Create a class Employee with these private fields:
//   - int id
//   - String name
//   - String department
//   - double basicSalary

// Write the following:
//   1. A parameterized constructor to set all four fields.
//   2. Getters for all fields and a setter for basicSalary.
//   3. A method double calculateNetSalary() that returns:
//        HRA = 20% of basicSalary
//        DA  = 10% of basicSalary
//        Tax = 5% of (basicSalary + HRA + DA)
//        Net Salary = basicSalary + HRA + DA - Tax
//   4. A method void display() that prints all details with the net salary.

// In main():
//   - Create an array of 5 Employee objects (hard-code the values).
//   - Write a static method Employee highestPaid(Employee[] arr) that returns the employee with the highest net salary.
//   - Write a static method void raiseSalary(Employee[] arr, String dept, double percent) that increases basicSalary of all employees in the given department by the given percent.
//   - Print all employees, call raiseSalary for "IT" with 10 percent, then print all again to show the change.
//   - Print the details of the highest paid employee.


class employee{
    int id ;
    String name;
    String department;
    double basicSalary;

    employee(int id, String name, String department, double basicSalary){

    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getdepatment(){
        return department;
    }

    public void setSalary(double basicSalarysalary){
        this.basicSalary = basicSalarysalary;
    }

    double HRA;
    double DA;
    double TAX;
    double netSalary;

    public double calculateNetSalary(){
         HRA = (basicSalary * 20)/100;
         DA = (basicSalary * 10)/100;
         TAX = ((basicSalary + HRA + DA)*5)/100 ;
         netSalary = (basicSalary + HRA + DA) - TAX;
        return netSalary;
    }
    
    public void display(){
        System.out.println("the net salary is " +netSalary);
        System.out.println("the DA is "+DA);
        System.out.println("the tax is "+TAX);
        System.out.println("the net salary is "+netSalary);
    }

}
public class employePayrollSystem {

    static employee heigestPaid(employee[] arr){
            double heigestNetSalary = 0;
            
            for(int i  ; i < arr.length; i++){
                if(heigestNetSalary > e.calculateNetSalary()){
                    heigestNetSalary = arr.basicSalary;
                }
            }
            return heigestNetSalary;

        }
    public static void main(String[] args) {
        employee[] e = new employee[5];
        e[0] = new employee(1, "shubham", "computer", 10000);
        e[1] = new employee(2, "rohit", "computer", 10836);
        e[2] = new employee(3, "rohan", "mechanical", 9058);
        e[3] = new employee(4, "robin", "mathematics", 89337);
        e[4] = new employee(5, "gaurav", "physic", 7367);

        // Write a static method Employee highestPaid(Employee[] arr) that returns the employee with the highest net salary.
        
         
    }
}
