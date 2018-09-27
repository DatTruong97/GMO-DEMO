package DecoratorPattern;

public class FingerprintSensor extends PhoneDecorator{
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Add fingerprint sensor feature!!");
    }

    public FingerprintSensor(Phone phone) {
        super(phone);
    }
}
