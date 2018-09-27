package MemetoPattern;

public class Management {
    public static void main(String[] args){
        CareTaker careTaker=new CareTaker();

        Originator originator=new Originator("text.txt");
        originator.write("Fist data ");
        System.out.println(originator.getContent());
        careTaker.save(originator);
        originator.write("Second data");
        System.out.println(originator.getContent());
        careTaker.undo(originator);
        System.out.println(originator.getContent());
    }
}
