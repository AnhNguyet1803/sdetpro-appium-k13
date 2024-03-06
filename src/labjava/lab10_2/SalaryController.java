package labjava.lab10_2;

import java.util.List;

public class SalaryController {
    public static int getTotalSalary(List<Emloyee> emloyeeList){
        int totalSalary = 0;
        for (Emloyee emloyee : emloyeeList){
            totalSalary = totalSalary + emloyee.getSalary() + emloyee.getSupportSalary();
        }
        return totalSalary;
    }
}
