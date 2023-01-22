package adapter.company.oldhrsystem;

public interface SalaryCalculator {
    double TotalSalary(String[][] workers, double[] salaries);

    double totalSalary(String[][] workers, double[] salaries);

    double TotalCalculator(String[][] workers, double[] salaries);
}