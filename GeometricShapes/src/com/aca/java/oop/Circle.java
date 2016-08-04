package com.aca.java.oop;

/**
 * Created by tabgarya on 8/4/2016.
 */
public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int)Math.PI*radius*radius;
    }
}
