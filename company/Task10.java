package com.company;

public class Task10 {
    public static void main(String[] args) {
        final int height = 180;
        final int weight = 83;
        int a = (height - 110);
        if (weight == a) {
            System.out.println("у вас идеальный вес");
        } else {
            if (weight > a) {
                System.out.println("Вам нужно скинуть:" + (weight - a) + ("КГ"));
            } else {
                System.out.println("Вам нужно набрать:" + Math.abs(weight - a) + ("КГ"));
            }
        }
    }
}
