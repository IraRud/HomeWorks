package skypro.java.course1.lesson7;

public class HW_1 {
    public static void main(String[] args) {

        /*ДЗ-1 Задача 1
        С помощью цикла for выведите в консоль все числа от 1 до 10.
         */
        System.out.println("\nЗадача 1:");
        byte i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        /*ДЗ-1 Задача 2
        С помощью цикла for выведите в консоль все числа от 10 до 1.
         */
        System.out.println("\nЗадача 2:");
        byte j;
        for (j = 10; j >=1; j--) {
            System.out.println(j);
        }

        /*ДЗ-1 Задача 3
        Выведите в консоль все четные числа от 0 до 17.
         */
        System.out.println("\nЗадача 3:");
        for (byte k = 0; k < 17; k+=2) {
            System.out.println(k);
        }

        /*ДЗ-1 Задача 4
        Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.
         */
        System.out.println("\nЗадача 4:");
        for (byte l = 10; l >= -10; l--) {
            System.out.println(l);
        }

    }
}
