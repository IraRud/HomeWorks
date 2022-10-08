package skypro.java.course1.lesson7;

public class HW_3 {
    public static void main(String[] args) {
        /* ДЗ-3 Задача 1
        Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц
        вы будете откладывать по 29 000 рублей "в банку". Выведите сумму накоплений
        за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей" . */
        System.out.println("\nЗадача 1:");
        int savings = 29_000;
        int totalSavings = 0;
        for (byte i = 1; i <= 12; i++) {
            totalSavings += savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " +
                    totalSavings + " рублей.");
        }

        /* ДЗ-3 Задача 2
        Перепишите решение задачи выше при условии, что деньги вы откладывать будете
        не "в банку", а в банк под проценты – 12% годовых. Выведите сумму накоплений
        за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей" . */
        System.out.println("\nЗадача 2:");
        int totalSavingsTwo = 0;
        for (byte i = 1; i <= 12; i++) {
            totalSavingsTwo += savings + totalSavingsTwo * 0.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " +
                    totalSavingsTwo + " рублей.");
        }
    }
}
