package com.kodilla.testing.ShapeCollector;
import com.kodilla.testing.ShapeCollector.Shape;


public class Circle implements Shape {
    private final static String name = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static class Square implements Shape{
        private final static String name = "Square";
        private double edgeLength;

        public Square(double edgeLength) {
            this.edgeLength = edgeLength;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Square square = (Square) o;

            return Double.compare(square.edgeLength, edgeLength) == 0;
        }

        @Override
        public int hashCode() {
            long temp = Double.doubleToLongBits(edgeLength);
            return (int) (temp ^ (temp >>> 32));
        }

        @Override
        public String getShapeName() {
            return name;
        }

        @Override
        public double getField() {
            return Math.pow(edgeLength, 2);
        }
    }
}