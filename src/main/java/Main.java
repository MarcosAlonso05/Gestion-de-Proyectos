
// Ejemplo de uso

import IA_ServicioExterno.Analisis_IA;
import IA_ServicioExterno.DelayPredicator;
import IA_ServicioExterno.DelayPredicatorAdapter;
import factory.ProjectFactory;
import projects.Project;

public class Main {
    public static void main(String[] args) {

        //Patron Factory Method
        ProjectFactory factory = new ProjectFactory();

        Project smallProject = factory.createProject("small");
        smallProject.execute();

        Project bigProject = factory.createProject("big");
        bigProject.execute();

        //Patron Adapter
        Analisis_IA externalService = new Analisis_IA();
        DelayPredicator adapter = new DelayPredicatorAdapter(externalService);

        String prediction = adapter.predict("5");
        System.out.println(prediction); // Retraso predicho: 5 días
    }
}
