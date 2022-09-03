import java.time.LocalDate;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Задание №1
        int currentYear = 2020;
        checkYear(currentYear);

        //Задание №2
        int clientOs = 0;
        int clientDeviceYear = 2022;
        getClientOs(clientOs, clientDeviceYear);

        //Задание №3
        int deliveryDistance = 87;
        deliveryTime(deliveryDistance);
    }

    //Метод для задания №1
    public static void checkYear (int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    //Метод для задания №2
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

    //Метод для задания №3
    public static void deliveryTime (int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день для доставки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня для доставки");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня для доставки");
        } else {
            System.out.println("Потребуется помощь специалиста логистики");
        }
    }
}