package Homework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> storage = new LinkedList<>();
        while (true) {
            System.out.print("Ввод: ");
            String command = scanner.nextLine();
            if ("exit".equals(command)) {
                break;
            }
            if ("revert".equals(command)) {
                try {
                    storage.remove();
                    System.out.println("Последняя строка удалена!");
                } catch (NoSuchElementException ex) {
                    System.err.println("Список пустой!");
                }
                continue;
            }
            if ("print".equals(command)) {
                if (storage.size() > 0) {
                    for (String el : storage) {
                        System.out.println(el);
                    }
                } else {
                    System.err.println("Список пустой!");
                }
                continue;
            }
            storage.push(command);
        }
        System.out.println("Программа завершена!");
    }
}
