package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getFiled() {
        return (a * h / 2.0);
    }

    @Override
    public String toString() {
        return getShapeName() + "(" + a + ", " + h + ")";
    }
}
