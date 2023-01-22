package adapter.company;

import adapter.company.newhrsystem.Employee;
import adapter.company.oldhrsystem.SalaryCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryAdapter extends SalaryAdaptee implements SalaryCalculator {

    @Override
    public double TotalSalary(String[][] workers, double[] salaries) {
        return 0;
    }

    @Override
    public double totalSalary(String[][] workers, double[] salaries) {
        return 0;
    }

    @Override
    public double TotalCalculator(String[][] workers, double[] salaries) {
        List<Employee> employeeList = new ArrayList<>();

        for (int n = 0; n<workers.length; n++){
            employeeList.add(new Employee(
                    workers[n][0],
                    workers[n][1],
                    workers[n][2],
                    new BigDecimal(salaries[n])));
        }
        return calculateSalaries(employeeList).doubleValue();
    }
}