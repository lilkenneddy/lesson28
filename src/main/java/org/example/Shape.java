package org.example;

abstract class Shape {
    // Абстрактний метод для обчислення площі
    abstract double calculateArea();

    // Абстрактний метод для обчислення периметра
    abstract double calculatePerimeter();

    // Метод для виведення інформації про фігуру
    double displayInfo() {
        System.out.println("Площа: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
        return 0;
    }

}
