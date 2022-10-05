package Lab8.exercise2;

public class Validator {
    public static boolean isValidRegistrationNumber(String registrationNumber) {
        System.out.println(registrationNumber.trim());
        char[] arr = registrationNumber.trim().toCharArray();
        if (registrationNumber.length() < 6 || registrationNumber.length() >= 12) {
            return false;
        } else if (!(Character.isDigit(arr[0]) && Character.isDigit(arr[1]))) {
            return false;
        } else if (!(arr[2] == '-')) {
            if (!(Character.isUpperCase(arr[3]) && Character.isUpperCase(arr[4]) && (arr[5] == '-'))) return false;
            if (!(arr[4] == '-' && Character.isUpperCase(arr[3]) && Character.isDigit(arr[5]))) return false;
        }
/*        else if () {
            return false;
        }*/
        else return true;

        return false;
    }
}
