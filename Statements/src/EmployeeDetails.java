public class EmployeeDetails {

    long empId =345;
    double empSalary = 10000;
    float empTax = 9.5f;
    int empDaysOfWork = 24;

    public void calculatePf()
    {
        float pfRate = 10.5f;
        System.out.println("The PF Rate of the employee is : "+pfRate);
    }
}
class MainProgram{

    public static void main(String[] args) {

        EmployeeDetails ed = new EmployeeDetails();
        System.out.println("The id of the employee is : "+ed.empId);
        System.out.println("The salary of the employee is : "+ed.empSalary);
        System.out.println("The percentage of tax the employee needs to pay is : "+ed.empTax);
        System.out.println("The total number of working days is : "+ ed.empDaysOfWork);
        ed.calculatePf();
    }
}
