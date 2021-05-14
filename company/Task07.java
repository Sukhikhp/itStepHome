package com.company;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("введите сумму вклада:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        System.out.println("введите годовой процент вклада:");
        double b = scanner.nextInt();
        System.out.println("ИТОГ:" + ((a / 100 * b) * 2 + a));
    }
}
