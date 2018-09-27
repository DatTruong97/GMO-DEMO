package Polymorphism;

public class Rectangle extends Shape{
    private double length;
    private double height;

    public Rectangle(double length,double height) {
        this.length = length;
        this.height=height;
    }

    @Override
    public double perimeter() {
        return (length+height)/2;
    }
}
