import org.junit.Test;
import static org.junit.Assert.*;
public class phoneCheckerWithAreaCodeTestDL {
    // Test R1: Valid phone number formats
    @Test
    public void testValidPhoneNumberWithoutDashes() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("2323333456");
        assertTrue(checker.checkValidNumber());
    }

    @Test
    public void testValidPhoneNumberWithDashes() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("232-333-3456");
        assertTrue(checker.checkValidNumber());
    }

    @Test
    public void testInvalidPhoneNumberFormatWithDashes() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("232-3333-456");
        assertFalse(checker.checkValidNumber());
    }

    @Test
    public void testInvalidPhoneNumberFormatWithoutProperDashes() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("232333-3456");
        assertFalse(checker.checkValidNumber());
    }

    // Test R2: Numbers must be all digits except the optional dashes
    @Test
    public void testInvalidPhoneNumberWithLetters() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("232-3B4-1234");
        assertFalse(checker.checkValidNumber());
    }

    @Test
    public void testInvalidPhoneNumberWithParentheses() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("(312)4449899");
        assertFalse(checker.checkValidNumber());
    }

    // Test R3: Valid area code
    @Test
    public void testInvalidAreaCodeStartingWith1() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("123-456-7890");
        assertFalse(checker.checkValidNumber());
    }

    @Test
    public void testInvalidAreaCodeWith9AsMiddleDigit() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("393-444-1234");
        assertFalse(checker.checkValidNumber());
    }

    // Test R4: Valid exchange code
    @Test
    public void testInvalidExchangeCodeStartingWith1() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("312-123-3333");
        assertFalse(checker.checkValidNumber());
    }

    @Test
    public void testValidExchangeCodeStartingWith2() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("312-223-4444");
        assertTrue(checker.checkValidNumber());
    }

    // R5: The final 4 digits have no restrictions, so we'll test a valid number to represent this rule.
    @Test
    public void testValidFinalFourDigits() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("212-323-0000");
        assertTrue(checker.checkValidNumber());
    }

    @Test
    public void testPhoneNumberIsNull() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL(null);
        assertFalse(checker.checkValidNumber());
    }

    @Test
    public void testPhoneNumberIncorrectLength() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("232333345");
        assertFalse(checker.checkValidNumber());
    }

    @Test
    public void testPhoneNumberWithDashesWrongPlaces() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("232-3333-456");
        assertFalse(checker.checkValidNumber());
    }

    @Test
    public void testPhoneNumberWithNonDigitCharacters() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("232-3a3-3456");
        assertFalse(checker.checkValidNumber());
    }

    @Test
    public void testAreaCodeLessThan200() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("1993333456");
        assertFalse(checker.checkValidNumber());
    }

    @Test
    public void testAreaCodeWith9AsSecondDigit() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("2933333456");
        assertFalse(checker.checkValidNumber());
    }

    @Test
    public void testExchangeCodeLessThan200() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("2321333456");
        assertFalse(checker.checkValidNumber());
    }

    @Test
    public void testExchangeCodeGreaterThan999() {
        PhoneCheckerWithAreaCode_DL checker = new PhoneCheckerWithAreaCode_DL("2321000456");
        assertFalse(checker.checkValidNumber());
    }

}
