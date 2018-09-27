package FactoryPattern;

public class CarManagement {
    public static void main(String[] args){
        CarFactory carFactory=new CarFactory();
        Car car=carFactory.getCar("Chevrolet");
        car.showInfo();
    }
}
