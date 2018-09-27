package AbstractFactoryPattern;


public class NormalFactory extends VehicleAbstractFactory{
    @Override
    public Motorbike createMotorbike() {
        return new NormalMotorbike();
    }

    @Override
    public Car createCar() {
        return new NormalCar();
    }
}
