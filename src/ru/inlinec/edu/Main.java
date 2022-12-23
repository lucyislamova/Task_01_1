package ru.inlinec.edu;

import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        Triangle triangle = new Triangle(readSideLen("a"), readSideLen("b"), readSideLen("c"));

        System.out.printf("Высота стороны A = %.3f\n", triangle.getHeightA());
        System.out.printf("Высота стороны B = %.3f\n", triangle.getHeightB());
        System.out.printf("Высота стороны C = %.3f\n", triangle.getHeightC());
    }

    private static float readSideLen(String sideName) {
        System.out.printf("Сторона %s: ", sideName);
        return scanner.nextFloat();
    }

}