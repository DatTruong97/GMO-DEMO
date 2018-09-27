package DecoratorPattern;

public class FaceSensor extends PhoneDecorator{
    public FaceSensor(Phone phone) {
        super(phone);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Add face sensor feature!!");
    }
}
