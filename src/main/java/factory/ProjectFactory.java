package factory;

import projects.BigProject;
import projects.Project;
import projects.SmallProject;

public class ProjectFactory {
    public Project createProject(String projectType) {
        if (projectType.equalsIgnoreCase("big")) {
            return new BigProject();
        } else if (projectType.equalsIgnoreCase("small")) {
            return new SmallProject();
        } else {
            throw new IllegalArgumentException("Tipo de tarea no válido");
        }
    }
}
