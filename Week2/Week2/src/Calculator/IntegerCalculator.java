package Calculator;

public class IntegerCalculator {
    public int integerDivision(int x, int y){
        if( y == 0){
            throw new ArithmeticException("Cannot Divide by Zero");
        }
        return x/y;
    }
    public int integerSubtraction(int x, int y){
        return x - y;
    }

}
