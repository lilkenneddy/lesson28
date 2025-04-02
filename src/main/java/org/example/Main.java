package org.example;

public class Main {
    public static void main(String[] args) {

        // Створення об'єкта Circle (Коло) з радіусом 5
        Shape circle = new Circle(5);

        // Створення об'єкта Rectangle (Прямокутник) з шириною 4 та висотою 6
        Shape rectangle = new Rectangle(4, 6);

        // Створення об'єкта Square (Квадрат) зі стороною 4
        Shape square = new Square(4);

        // Виведення інформації про коло
        circle.displayInfo();
        System.out.println("----------------------");

        // Виведення інформації про прямокутник
        rectangle.displayInfo();
        System.out.println("----------------------");

        // Виведення інформації про квадрат
        square.displayInfo();
    }
}
