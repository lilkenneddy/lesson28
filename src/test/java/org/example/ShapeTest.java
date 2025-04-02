package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    void shouldCalculateCircleArea() {
        //given
        Shape shape = new Circle(5.0);
        //when
        double area = shape.calculateArea();
        //then
        assertEquals(78.53981633974483, area);
    }

    @Test
    void shouldCalculateCirclePerimeter() {
        //given
        Shape shape = new Circle(5.0);
        //when
        double perimeter = shape.calculatePerimeter();
        //then
        assertEquals(31.41592653589793, perimeter);
    }

    @Test
    void shouldCalculateRectangleArea() {
        //given
        Shape shape = new Rectangle(4.0, 6.0);
        //when
        double area = shape.calculateArea();
        //than
        assertEquals(24.0, area);
    }

    @Test
    void shouldCalculateRectanglePerimeter() {
        //given
        Shape shape = new Rectangle(4.0, 6.0);
        //when
        double perimeter = shape.calculatePerimeter();
        //then
        assertEquals(20.0, perimeter); // Має бути 20.0, а не 24.0
    }


    @Test
    void shouldCalculateSquareArea() {
        //given
        Shape shape = new Square(4.0);
        //when
        double area = shape.calculateArea();
        //then
        assertEquals(16.0, area);
    }

    @Test
    void shouldCalculateSquarePerimeter() {
        // Given
        Shape shape = new Square(6);

        // When
        double perimeter = shape.calculatePerimeter();

        // Then
        assertEquals(24.0, perimeter, 0.0001);
    }

}



