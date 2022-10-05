package Lab8.exercise2;

public class Validator {
    public static boolean isValidRegistrationNumber(String registrationNumber) {
        String reg = registrationNumber.trim();
        char[] arr = reg.toCharArray();
        if (reg.length() < 6 || reg.length() >= 12) {
            return false;
        } else if (!(Character.isDigit(arr[0]) && Character.isDigit(arr[1]))) {
            return false;
        } else if (!(arr[2] == '-')) {
            return false;
        }
        else if (!((Character.isUpperCase(arr[3]) && Character.isUpperCase(arr[4]) && (arr[5] == '-')) ||
                (Character.isUpperCase(arr[3]) && arr[4] == '-' && Character.isDigit(arr[5])))) return false;
        try {
                Integer.parseInt(reg.substring(6));
                return true;
        }catch (Exception e){
                return false;
        }
    }
}
