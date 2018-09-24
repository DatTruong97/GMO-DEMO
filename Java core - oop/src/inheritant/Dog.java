package inheritant;

public class Dog extends Animal{
    @Override
    public void call() {
        System.out.println("Gau Gau");
    }
    public void eat(){
        System.out.println("The dog is eating");
    }
}
