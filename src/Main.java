public class Main {
    public static void checkYear (int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным.");
        } else {
            System.out.println(year + " год не является высокосным.");
        }
    }
    public static void main(String[] args) {
        int currentYear = 2020;
        checkYear(currentYear);
    }
}