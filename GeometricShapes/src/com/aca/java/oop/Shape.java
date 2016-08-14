package com.aca.java.oop;

/**
 * Created by tabgarya on 8/4/2016.
 */
public abstract class Shape implements Comparable<Shape>, Cloneable {

    public abstract double getArea();

    public int compareTo(Shape shape) {
        return (int) (this.getArea() - shape.getArea());
    }
    
    public Shape getClone(){
    	try {
			return (Shape)super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		} 
    }
}
