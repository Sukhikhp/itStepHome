package com.company;


import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Введите количество учеников:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pie = 1;
        double milk = 0.200;

        System.out.println("Количество пирожков и бутылок молока если все ученики менее 30кг: " + n * 2 + " пирожков и " + (int) Math.ceil((milk * n) * 2 / 0.9) + "бут.");
        System.out.println("Количество пирожков и бутылок молока если 60% учеников менее 30кг: " + (int) Math.ceil(n * 0.6 + n) + " пирожков и " + (int) Math.ceil((0.6 * (milk * n) + (milk * n)) / 0.9) + "бут.");
        System.out.println("Количество пирожков и бутылок молока если 1% учеников менее 30кг: " + (int) Math.ceil(n * 0.01 + n) + " пирожков и " + (int) Math.ceil(0.01 * (milk * n) + (milk * n) / 0.9) + "бут.");


    }
}
