package Calculator;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class integerCalculatorClassTest {
    @DisplayName("Div 1/2 = 0")
    @org.junit.jupiter.api.Test
    void testIntegerDivision_1DividedBy2_ShouldBe_0() {
        // Arrange
        IntegerCalculator ICalc = new IntegerCalculator();
        int x = 1;
        int y = 2;
        int expect = x/y;
        int res = ICalc.integerDivision(x,y);
        assertEquals(expect, res, () ->{
            return String.format("Division %s/%s did not produce %s", x, y, res);
        });
    }
    @DisplayName("Div 4/2 = 2")
    @org.junit.jupiter.api.Test
    void integerDivision_4DividedBy2_shouldBe_2() {
        IntegerCalculator ICalc = new IntegerCalculator();
        int res = ICalc.integerDivision(4,2);
        int expect = 2;
        assertEquals(expect, res,"4/2 did not produce 2");
    }
    @DisplayName("Div 4/0 => exception")
    @org.junit.jupiter.api.Test
    void integerDivision_4DividedBy0_shouldBe_Exception() {
        // Arrange
        IntegerCalculator ICalc = new IntegerCalculator();
        int x = 4;
        int y = 0;
        String expectedErrorMsg = " Cannot Divide by Zero";
        // Act and Assert
        ArithmeticException AExcept = assertThrows(ArithmeticException.class, ()->{
            ICalc.integerDivision(x,y);
        },"Divide By Zero Should throw exception");
        assertEquals(expectedErrorMsg, AExcept.getMessage());
    }
    @DisplayName("Sub 10-5 = 5")
    @org.junit.jupiter.api.Test
    void testIntegerSubtraction_10_minus_5_shouldBe_5() {
        IntegerCalculator ICalc = new IntegerCalculator();
        int res = ICalc.integerSubtraction(10,5);
        int expect = 5;
        assertEquals(expect, res, "10-5 did not produce 5");
    }
    @org.junit.jupiter.api.Test
    void testIntegerSubtraction_Neg4MinusNeg2_shouldBe_Neg2() {
        //Arrange
        IntegerCalculator ICalc = new IntegerCalculator();
        int x = -4;
        int y = -2;
        int expect = -2;
        //Act
        int res = ICalc.integerSubtraction(x,y);
        //Assert
        assertEquals(expect, res, "-4 - -2 did not produce -2");
    }
    @org.junit.jupiter.api.Test
    void testIntegerSubtraction_WithMinIntMinus1_shouldBeException() {
        //Arrange
        IntegerCalculator ICalc = new IntegerCalculator();
        int x = Integer.MIN_VALUE;
        int y = 1;
        int expect = Integer.MIN_VALUE - 1;
        //Act
        int res = ICalc.integerSubtraction(x,y);
        System.out.printf("Subtraction res=%s", res);;
        //Assert
        assertEquals(expect, res, "Expect exception");
    }
}