public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600)); //should return false (out of range)
        System.out.println(isLeapYear(1600)); //should return true (leap year)
        System.out.println(isLeapYear(2017)); //should return false (not leap year)
        System.out.println(isLeapYear(2000)); //should return true (leap year)

    }


    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0) && (year % 100 != 0)) {
                return true;
            } else if (year % 400 == 0) {
                return true;

            } else {
                return false;
            }
        }
        return false;
    }
}