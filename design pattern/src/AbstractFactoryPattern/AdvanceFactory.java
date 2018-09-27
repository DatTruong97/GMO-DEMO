package AbstractFactoryPattern;

//import FactoryPattern.Car;

public class AdvanceFactory extends VehicleAbstractFactory{
    @Override
    public Motorbike createMotorbike() {
        return new AdvanceMotorbike();
    }

    @Override
    public Car createCar() {
        return new AdvanceCar();
    }
}
