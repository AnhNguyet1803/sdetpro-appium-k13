package labjava.lab10_2;


import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        List<Emloyee> employeeList = new ArrayList<>();
        addFTE(employeeList,3);
        addContractEmployees(employeeList,1);
        int totalSalary = SalaryController.getTotalSalary(employeeList);
        System.out.println("Total salary for all employees: " + totalSalary);
    }

    public static void addFTE(List<Emloyee> employeeList, int numEmployees) {
        for (int i = 0; i < numEmployees; i++) {
            employeeList.add(new FTE()); // Full-time employee
        }
    }

    public static void addContractEmployees(List<Emloyee> employeeList, int numEmployees) {
        for (int i = 0; i < numEmployees; i++) {
            employeeList.add(new ContractEmloyee()); // Contract employee
        }
    }
}
