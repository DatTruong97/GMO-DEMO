package AbstractFactoryPattern;

public class NormalMotorbike implements Motorbike{
    @Override
    public void create() {
        System.out.println("Create normal motorbike!!");
    }
}
