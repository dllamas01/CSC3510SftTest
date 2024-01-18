public class RevString {
    public static void main(String[] args) {
        String myString = "hel there";
        String first3 = myString.substring(0,3);
        System.out.printf("First3:%s", first3);
        char x = myString.charAt(2);
        System.out.printf("\nChar:%s", x);
    }
}
