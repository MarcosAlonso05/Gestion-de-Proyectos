
// Ejemplo de uso

import factory.ProjectFactory;
import projects.Project;

public class Main {
    public static void main(String[] args) {
        ProjectFactory factory = new ProjectFactory();

        Project smallProject = factory.createProject("small");
        smallProject.execute();

        Project bigProject = factory.createProject("big");
        bigProject.execute();
    }
}
