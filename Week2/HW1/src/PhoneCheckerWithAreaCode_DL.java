public class PhoneCheckerWithAreaCode_DL {
    private final String phone;
    public PhoneCheckerWithAreaCode_DL(String phone){
        this.phone = phone;
    }
    public boolean checkValidNumber() {
        // Check if the phone number is null or has incorrect length
        if (phone == null || !(phone.length() == 10 || phone.length() == 12)) {
            return false;
        }

        // Check for optional dashes in the correct places
        if (phone.length() == 12 && (phone.charAt(3) != '-' || phone.charAt(7) != '-')) {
            return false;
        }

        // Check for digits only (excluding dashes)
        for (int i = 0; i < phone.length(); i++) {
            if (i != 3 && i != 7 && !Character.isDigit(phone.charAt(i))) {
                return false;
            }
        }

        // Check the area code rule (R3)
        int areaCode = Integer.parseInt(phone.substring(0, 3));
        if (areaCode < 200 || areaCode > 999 || areaCode % 100 == 93) {
            return false;
        }

        // Check the exchange code rule (R4)
        int exchangeCode = Integer.parseInt(phone.substring(phone.length() == 12 ? 4 : 3, phone.length() == 12 ? 7 : 6));
        return exchangeCode >= 200 && exchangeCode <= 999;

        // The last four digits (R5) have no restrictions
    }
}
