package DecoratorPattern;

public class PhoneDecorator implements Phone{
    protected Phone phone;

    public PhoneDecorator(Phone phone){
        this.phone=phone;
    }

    @Override
    public void assemble() {
        this.phone.assemble();
    }
}
