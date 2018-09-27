package Polymorphism;

public class Square extends Shape{
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public double perimeter() {
        return edge*4;
    }
}
