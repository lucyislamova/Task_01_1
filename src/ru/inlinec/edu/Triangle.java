package ru.inlinec.edu;

public class Triangle {
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(float sideA, float sideB, float sideC) {
        checkTriangle(sideA, sideB, sideC);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public float getSideA() {
        return sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public void checkTriangle(float sideA, float sideB, float sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Стороны треугольника должны быть больше 0");
        }
        if (sideA > (sideB + sideC) || sideB > (sideB + sideC) || sideC > (sideA + sideB)) {

            throw new IllegalArgumentException("Сторона треугольника не может быть больше суммы 2х других сторон");
        }
    }

    private float getHeight(float side) {
        float semiP = (getSideA() + getSideB() + getSideC()) / 2; //полупериметр
        return 2 / side * (float) Math.sqrt((semiP - getSideA()) * (semiP - getSideB()) * (semiP - getSideC()));
    }

    public float getHeightA() {
        return getHeight(getSideA());
    }

    public float getHeightB() {
        return getHeight(getSideB());
    }

    public float getHeightC() {
        return getHeight(getSideC());
    }
}
