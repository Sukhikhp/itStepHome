package com.company;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("введите число:");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x % 1 != 0) {
            System.out.println("Число имеет вещественную часть");
        } else {
            System.out.println("Число не имеет вещественную часть");
        }
    }
}
