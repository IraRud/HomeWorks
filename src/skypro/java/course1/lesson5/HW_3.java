package skypro.java.course1.lesson5;

public class HW_3 {
    public static void main(String[] args) {
        //ДЗ-3 Задача 1
        int ageThird = 24;
        if (ageThird < 2) {
            System.out.println("\nЕсли возраст человека равен " + ageThird +
                    ", то ему нужно сидеть дома.");
        } else if (ageThird >= 2 && ageThird <= 6) {
            System.out.println("\nЕсли возраст человека равен " + ageThird +
                    ", то ему нужно ходить в сад.");
        } else if (ageThird >= 7 && ageThird <= 18) {
            System.out.println("\nЕсли возраст человека равен " + ageThird +
                    ", то ему нужно ходить в школу.");
        } else if (ageThird > 18 && ageThird <= 24) {
            System.out.println("\nЕсли возраст человека равен " + ageThird +
                    ", то ему нужно ходить в ВУЗ.");
        } else {
            System.out.println("\nЕсли возраст человека равен " + ageThird +
                    ", то ему нужно ходить на работу.");
        }

        //ДЗ-3 Задача 2
        int ageOfСhild = 30;
        if (ageOfСhild <= 5) {
            System.out.println("\nЕсли ребенку " + ageOfСhild +
                    ", то он не может кататься на аттракционе.");
        } else if (ageOfСhild > 5 && ageOfСhild <= 14) {
            System.out.println("\nЕсли ребенку " + ageOfСhild +
                    ", он может кататься только в сопровождении взрослого. " +
                    "Если взрослого нет, то кататься нельзя");
        } else if (ageOfСhild > 14 && ageOfСhild <= 18) {
            System.out.println("\nЕсли ребенку " + ageOfСhild +
                    ", он может кататься без сопровождения взрослого.");
        } else {
            System.out.println("\nЕсли 'ребенку' " + ageOfСhild +
                    ", то он уже не ребенок.");
        }

        //ДЗ-3 Задача 3
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("\none = " + one + " - самое большое число.");
        } else if (two > one && two > three) {
            System.out.println("\ntwo = " + two + " - самое большое число.");
        } else if (three > one && three > one) {
            System.out.println("\nthree = " + three + " - самое большое число.");
        } else {
            System.out.println("\nСразу несколько чисел являются максимальными.");
        }

    }
}
