package Practice;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if (year < 0) {
            return false;
        }
        if (year % 4 != 0) {
            return false;
        }
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LeapYear lp = new LeapYear();
        System.out.println(lp.isLeapYear(2004)); // Prints: true
    }
}