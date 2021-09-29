package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Task 1
//        task1(2442);

        //Task 2
//        task2();

        //Task3
//        task3(3,4);

        //Task4
//        task4();

        //Task5
//        task5(2, -3, 8);

        //Task6
//        task6(4, 5, 9);

        //Task7
//        task7(48,21, 1.5);

        //Task8
//        task8(10, 2);

        //Task9
//        task9();

        //Task10
//        task10();
    }

    public static void task1(int a) {
        if (((a % 10) + (a / 10) % 10) == ((a / 100) % 10 + a / 1000)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void task2(int a, int b, int c) {
        int sum = (int) (((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - (Math.pow(a, 3) * c + Math.pow(b, -2)));
        System.out.println(sum);
    }

    public static void task3(int a, int b) {
        System.out.println("Perimeter = " + (int) (Math.sqrt(a * a + b * b) + a + b));
        System.out.println("Area = " + (a * b) / 2);
    }

    public static void task4(int x, int y) {
        if ((x == 0 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y <= 0 && y >= -3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void task5(int a, int b, int c) {
        int[] array = {a, b, c};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(Math.pow(array[i], 2));
            } else {
                System.out.println(Math.pow(array[i], 4));
            }
        }
    }

    public static void task6(int a, int b, int c) {
        int max = 0;
        int min = 0;

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            max = b;
        } else {
            min = c;
        }

        int sum = min + max;
        System.out.println(max + " + " + min + " = " + sum);
    }

    public static void task7(double a, double b, double h) {
        if (a < b) {
            for (double i = a; i < b; ) {
                double f = Math.pow(Math.sin(i), 2) - Math.cos(2 * i);
                System.out.println("Для аргумента " + i + " значение функцции равно " + f);
                i += h;
            }
        } else {
            for (double i = b; i < a; ) {
                double f = Math.pow(Math.sin(i), 2) - Math.cos(2 * i);
                System.out.println("Для аргумента " + i + " значение функцции равно " + f);
                i += h;
            }
        }
    }

    public static void task8(int n, int k) {
        Random random = new Random();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void task9() {

    }

    public static void task10() {

    }
}

