package FactoryPattern;

public class CarFactory {
    public Car getCar(String carType){
        Car car=null;
        switch (carType){
            case "Toyota":
                car=new Toyota();
                break;
            case "Hyundai":
                car=new Hyundai();
                break;
            case "BMW":
                car=new BMW();
                break;
            case "Chevrolet":
                car=new Chevrolet();
                break;
        }
        return car;
    }
}
