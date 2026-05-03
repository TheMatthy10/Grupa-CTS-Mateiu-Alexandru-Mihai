package Observer;

import java.util.*;
public abstract class Subject {
    public List<Observer> observers;

    public Subject(List<Observer> observers) {
        this.observers = new ArrayList<>();
    }
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }
    public void notifyObservers(String mesaj){
        for (Observer observer : observers){
            observer.primesteNotificarea(mesaj);
        }
    }
}
