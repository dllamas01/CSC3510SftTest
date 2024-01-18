package Calculator;

public class IntegerCalculator {
    public int integerDivision(int x, int y){
        if( y == 0){
            throw new ArithmeticException("Cannot Divide by Zero");
        }
        return x/y;
    }
    public int integerSubtraction(int x, int y) {
        if (y > 0 && x < Integer.MIN_VALUE + y) {
            throw new ArithmeticException("Integer underflow");
        } else if (y < 0 && x > Integer.MAX_VALUE + y) {
            throw new ArithmeticException("Integer overflow");
        }
        return x - y;
    }

}
