package Polymorphism;

public class ShapeManagement {
    public static void main(String[] args){
        Square square=new Square(5);
        System.out.println("Square perimeter: "+square.perimeter());
        Rectangle rectangle=new Rectangle(15,20);
        System.out.println("Rectangle perimeter: "+rectangle.perimeter());
        Circle circle=new Circle(25);
        System.out.println("Circle perimeter: "+circle.perimeter());
    }
}
