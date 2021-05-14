package com.company;

public class Task05 {
    public static void main(String[] args) {
        /*final double R = 25;
        double P = (R * R) * 3.1415;
        System.out.println("Площадь круга равна: " + P);
        double Q = 2*3.14*R;
        System.out.println("Площадь круга равна: " + Q);*/
        // Менее точный вариант
        final double R = 25;
        double P = Math.PI * (R * R);
        System.out.println("Площадь круга равна: " + P);
        double S = Math.PI * 2 * R;
        System.out.println("Длины окружности равна: " + S);
        // Более точный вариант
    }

}
