package com.aca.java.oop;

import java.awt.*;

/**
 * Created by tabgarya on 8/4/2016.
 */
public class Rectangle extends Shape{

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    private int lenght;
    private  int width;


    @Override
    public int getArea() {
        return lenght*width;
    }
}
