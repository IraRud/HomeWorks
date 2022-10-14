package skypro.java.course1.lesson8;

public class HW_1 {
    public static void main(String[] args) {
        /* ДЗ-1 Задача 1
        Продолжим работать с накоплениями. Продолжите работать с кодом, который вы написали
        в предыдущем уроке.
        С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить
        2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать
        по 15 тысяч рублей.
        Результат программы должен быть выведен в консоль в формате "Месяц … , сумма накоплений
        равна … рублей" с тем количеством месяцев,необходимым для накопления данной суммы. */
        System.out.println("\nЗадача 1:");
        int savings = 15_000;
        int totalSavings = 0;
        byte month = 0;
        while (totalSavings <= 2_459_000 ) {
            totalSavings += savings;
            totalSavings += totalSavings * 0.01;
            month += 1;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " +
                totalSavings + " рублей.");
    }
}
