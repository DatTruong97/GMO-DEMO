package DecoratorPattern;

public class AndroidPhone implements Phone{
    @Override
    public void assemble() {
        System.out.println("Assemble android phone!!");
    }
}
