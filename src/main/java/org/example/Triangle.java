package org.example;

public class Triangle extends Shape {
    private double sideA, sideB, sideC;

    // Конструктор
    @Override
    double calculateArea() {
        double p = calculatePerimeter() / 2; // напівпериметр
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)); // формула Герона

    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
