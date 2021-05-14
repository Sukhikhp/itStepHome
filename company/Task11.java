package com.company;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Сколько секунд на часах у ДМ:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("До НГ осталось " + x / 86400 + "дней, " + (x % 86400) / 3600 + "часов, " + ((x % 86400) % 3600) / 60 + "минут и " + x % 60 + "секунд");
    }
}
