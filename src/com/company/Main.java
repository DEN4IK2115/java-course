package com.company;

public class Main {

    public static void main(String[] args) {

        //Задание 1.0
        System.out.println('\n' + "Задание 1.0" + '\n');
        int n = 100;
        double []array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        double max = array[0];
        double min = array[0];
        double avg = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i];
        }
        avg = avg/ array.length;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);

        //Задание 1.1
        System.out.println('\n' + "Задание 1.1" + '\n');
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        //Задание 1.2
        System.out.println('\n' + "Задание 1.2" + '\n');
        for (int i = 2; i<= 100; i++) {
            boolean isSemple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSemple = false;
                    break;
                }
            }
            if (isSemple)
                System.out.println(i);
        }
    }
}
