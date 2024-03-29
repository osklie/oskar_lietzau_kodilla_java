package adapter.company;

import adapter.company.oldhrsystem.Workers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalaryAdapterTestSuite {

    @Test
    public void testTotalSalary() {
        // Given
        Workers workers = new Workers();                      // [1]
        SalaryAdapter salaryAdapter = new SalaryAdapter();    // [2]
        // When
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());   // [3]
        // Then
        System.out.println(totalSalary);
        assertEquals(totalSalary, 27750, 0);                  // [4]
    }

}