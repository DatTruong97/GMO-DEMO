package AbstractFactoryPattern;

public class NormalCar implements Car{
    @Override
    public void create() {
        System.out.println("Create normal car!!");
    }
}
