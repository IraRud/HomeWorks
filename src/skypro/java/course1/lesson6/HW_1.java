package skypro.java.course1.lesson6;

public class HW_1 {
    public static void main(String[] args) {

        //ДЗ-1 Задача 1
        System.out.println("\nЗадание №1.");
        byte clientOS = 0; // 0 — iOS, 1 — Android
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке.");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.");
                break;
            default:
                System.out.println("Для Вашей ОС не предусмотрено мобильное приложение.");
        }

        //ДЗ-1 Задача 2
        System.out.println("\nЗадание №2.");
        byte clientOSTwo = 1; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2015;
        switch (clientOSTwo) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке.");
                }
                break;
            default:
                System.out.println("Для Вашей ОС не предусмотрено мобильное приложение.");
        }

        //ДЗ-1 Задача 3
        System.out.println("\nЗадание №3.");
        /* високосным является каждый четвертый год, но не является каждый сотый.
        Также високосным является каждый четырехсотый год
         */
        int year = 400;
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        //ДЗ-1 Задача 4
        System.out.println("\nЗадание №4.");
        /* Доставка в пределах 20 км занимает сутки.
        Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
         */
        int deliveryDistance = 95;
        if (deliveryDistance % 20 == 0) {
            System.out.println("Потребуется дней для доставки: " + deliveryDistance / 20);
        } else {
            System.out.println("Потребуется дней для доставки: " + deliveryDistance / 20);
        }


        //ДЗ-1 Задача 5
        System.out.println("\nЗадание №5.");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Данный месяц является зимним.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Данный месяц является весенним.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Данный месяц является летним.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Данный месяц является осенним.");
                break;
            case 12:
                System.out.println("Данный месяц является зимним.");
                break;
            default:
                System.out.println("Такого месяца нетю");
        }
    }
}
