
//Implementacion de un projecto pequeño

package projects;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class SmallProject implements Project {
    private String status;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void execute() {
        System.out.println("Ejecutando Projecto simple...");
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
        notifyObservers("El projecto pequeño ahora está " + status);
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
