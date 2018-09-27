package ObserverPattern;

import java.util.ArrayList;

public class PostOffice implements Subject{

    private ArrayList<Observer>observers=new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i=0;i<observers.size();i++){
            observers.get(i).update();
        }
    }
}
