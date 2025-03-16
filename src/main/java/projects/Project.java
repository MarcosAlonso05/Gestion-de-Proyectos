
//Interfaz comun para los Projectos

package projects;

import observer.Observer;

public interface Project {
    void execute();
    void setStatus(String status);
    void attach(Observer observer);
}
