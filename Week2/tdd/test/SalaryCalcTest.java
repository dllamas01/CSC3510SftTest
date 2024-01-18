import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalcTest {
    @DisplayName("100000 sal is 48.08")
    @Test
    void testSalaryCalc_100_000Sal_ShouldBe48_08() {
        //Arrange
        double annualSalary = 100000;
        SalaryCalc sc = new SalaryCalc(annualSalary);
        double expected = 48.08;
        //Act
        double res = sc.calcHourly();
        //Assert
        assertEquals(expected, res);
    }
    @DisplayName("Negative Sal Throws Exception")
    @Test
    void testSalaryCalc_negativeSal_throwsException() {
        //Arrange
        double annualSalary = -1;
        SalaryCalc sc = new SalaryCalc(annualSalary);
        double expected = 48.08;
        String expectedMsg = "Illegal Negative Salary";
        //Act
        IllegalArgumentException IArg = assertThrows(IllegalArgumentException.class,() -> {
            double res = sc.calcHourly();
        });
        //Assert
        assertEquals(expectedMsg, IArg.getMessage());
    }
    @DisplayName("1,000,000 sal is 100,000")
    @Test
    void testSalaryCalc_salGreaterThan_1_000_000_salShouldBe_100_000() {
        //Arrange
        double annualSalary = 1000000;
        SalaryCalc sc = new SalaryCalc(annualSalary);
        double expected = 480.77;
        //Act
       double res =sc.calcHourly();
        //Assert
        assertEquals(expected, res);
    }
}