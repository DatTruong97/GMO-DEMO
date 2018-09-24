package AbstractFactoryPattern;

public class Management {
    public static void main(String[] args) {
        VehicleAbstractFactory factory = VehicleFactory.getFactory("Advance");
        Motorbike motorbike = factory.createMotorbike();
        motorbike.create();

        Car car=factory.createCar();
        car.create();
    }
}
