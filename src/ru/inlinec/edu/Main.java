package ru.inlinec.edu;

import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        try {
            Triangle triangle = new Triangle(readSideLen("a"), readSideLen("b"), readSideLen("c"));
            triangle.printHeights();
        } catch (IllegalAccessException exc) {
            System.out.println(exc.getMessage());
        }
    }
    private static float readSideLen( String sideName ){
        System.out.printf("Сторона %s: ", sideName);
        return  scanner.nextFloat();
    }

}