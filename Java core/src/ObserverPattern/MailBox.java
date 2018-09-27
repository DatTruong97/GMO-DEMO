package ObserverPattern;

public class MailBox implements Observer{
    String address;

    public MailBox(String address){
        this.address=address;
    }

    @Override
    public void update() {
        System.out.println(this.address+" received mail!!");
    }
}
