package labjava;

import java.util.ArrayList;
import java.util.List;

/*
1- Create a class Employee with a method salary to return employee’s salary
2- There are 2 types of employee: Full time employee and contract employee
3- Full time employee has salary is 50000 and contract employee has salary 40000
4- Write a method to accept a list of Employee and calculate total salary
5- For example, company has 3 FTE and 2 contractor
*/
class Employee{
    public int Salary(){
        return 0;
    }
}

class FullTimeEmployee extends Employee{
    @Override
    public int Salary(){
        return 50000;
    }
}

class ContractEmployee extends Employee{
    @Override
    public int Salary(){
        return 40000;
    }
}

class Company{
    public static int caculateTotalSalary(List<Employee> employees){
        int totalSalary = 0;
        for(Employee employee : employees){
            totalSalary +=employee.Salary();
        }
        return totalSalary;
    }
}
public class lab8 {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add 3 FullTimeEmployees
        for (int i = 0; i < 3; i++) {
            employees.add(new FullTimeEmployee());
        }

        // Add 2 ContractEmployees
        for (int i = 0; i < 2; i++) {
            employees.add(new ContractEmployee());
        }

        // Calculate total salary
        int totalSalary = Company.caculateTotalSalary(employees);
        System.out.println("Total salary for the company: " + totalSalary);
    }
}
