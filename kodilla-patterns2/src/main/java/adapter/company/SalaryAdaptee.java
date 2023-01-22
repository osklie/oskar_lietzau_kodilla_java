package adapter.company;

import adapter.company.newhrsystem.CompanySalaryProcessor;
import adapter.company.newhrsystem.Employee;
import adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public abstract class SalaryAdaptee implements SalaryProcessor {

    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }

    public abstract double TotalCalculator(String[][] workers, double[] salaries);
}