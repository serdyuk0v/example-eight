import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void checkYear (int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    public static void getClientOs (int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs <= 1 && clientOs >= 0) {
            if (clientOs == 1 && clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOs == 0 && clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложение для iOS по ссылке");
            } else if (clientOs == 1) {
                System.out.println("Установите lite версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите lite версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Извините, ваша OS не поддерживается.");
        }

    }
    public static void main(String[] args) {
        //Задание №1
        int currentYear = 2020;
        checkYear(currentYear);

        //Задание №2
        int clientOs = 0;
        int clientDeviceYear = 2022;
        getClientOs(clientOs, clientDeviceYear);
    }
}