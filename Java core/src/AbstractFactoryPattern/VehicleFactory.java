package AbstractFactoryPattern;

public class VehicleFactory {
    public static VehicleAbstractFactory getFactory(String vehicleQuality){
        switch (vehicleQuality){
            case  "Normal":
                return new NormalFactory();
            case "Advance":
                return new AdvanceFactory();
                default:
                    throw new UnsupportedOperationException("This vehicle is unsupported ");
        }
    }
}
