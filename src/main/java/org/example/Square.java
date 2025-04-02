package org.example;

class Square extends Rectangle {
    private final String type;

    Square(double side) {
        super(side, side); // Використовуємо Rectangle для збереження сторони
        this.type = "Квадрат";
    }

    @Override
    public double calculatePerimeter() {
        return 4 * super.getWidth(); // Використовуємо метод getWidth() з Rectangle
    }
}




    
