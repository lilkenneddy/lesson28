package org.example;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2.0); //Формула для обчислення площі круга
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Формула довжини кола
    }
}




