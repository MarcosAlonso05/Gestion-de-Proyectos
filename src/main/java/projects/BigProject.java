
//Implementacion de un projecto grande

package projects;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class BigProject implements Project {
    private String status;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void execute() {
        System.out.println("Ejecutando Proyecto grande...");
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
        notifyObservers("El Projecto grande ahora está " + status);
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
