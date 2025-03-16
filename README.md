# Gestion-de-Proyectos
## Ejemplo de Uso Codigo del Repositorio

Este proyecto es una plataforma de gestión de proyectos que utiliza los patrones de diseño Factory Method, Observer y Adapter. A continuación, se muestra cómo usar la plataforma paso a paso.

## Explicación de `Main.java`

El archivo `Main.java` ejecuta la plataforma de gestión de proyectos utilizando los patrones de diseño mencionados. A continuación, se explica cada sección del código:

### 1. Uso del Patrón Factory Method

java
// Crear una fábrica de proyectos
ProjectFactory factory = new ProjectFactory();

// Crear y ejecutar un proyecto pequeño
Project smallProject = factory.createProject("small");
smallProject.execute();

// Crear y ejecutar un proyecto grande
Project bigProject = factory.createProject("big");
bigProject.execute();


Aquí se usa `ProjectFactory` para crear instancias de `SmallProject` y `BigProject`, y se ejecutan sus respectivas tareas.

### 2. Uso del Patrón Adapter

java
// Crear un servicio externo de análisis de IA
Analisis_IA externalService = new Analisis_IA();

// Adaptar el servicio para que funcione en la plataforma
DelayPredicator adapter = new DelayPredicatorAdapter(externalService);

// Obtener una predicción de retraso en días
String prediction = adapter.predict("5");
System.out.println(prediction); // Retraso predicho: 5 días


Se emplea un `Adapter` para conectar la plataforma con un servicio externo de predicción de retrasos.

### 3. Uso del Patrón Observer

java
// Crear usuarios
User user = new User("Tiburcio");
User user2 = new User("Segismundo");

// Asignar observadores a los proyectos
smallProject.attach(user);
bigProject.attach(user2);

// Cambiar el estado de los proyectos
smallProject.setStatus("Completada");
bigProject.setStatus("En progreso");


Aquí, `User` actúa como observador de `SmallProject` y `BigProject`. Cuando el estado de un proyecto cambia, los observadores reciben una notificación.

### 4. Salida Esperada

```plaintext
Tiburcio ha recibido una notificación: El proyecto pequeño ahora está Completada
Segismundo ha recibido una notificación: El proyecto grande ahora está En progreso
```

Este es el resultado esperado cuando se ejecuta `Main.java`.


## Descripción Breve de los Componentes

### 1. Factory Method: `ProjectFactory`
**Función:** Crea instancias de proyectos (`SmallProject` o `BigProject`) según el tipo solicitado.

### 2. Proyectos: `SmallProject` y `BigProject`
**Función:** Representan proyectos pequeños y grandes, respectivamente. Notifican a los observadores cuando cambia su estado.

### 3. Observer Pattern: `Observer` y `User`
**Función:** Notifica a los usuarios cuando cambia el estado de un proyecto.

### 4. Adapter Pattern: `DelayPredicatorAdapter`
**Función:** Adapta el servicio externo de análisis de IA (`Analisis_IA`) para que pueda ser utilizado por la plataforma.

### 5. Servicio Externo: `Analisis_IA`
**Función:** Proporciona análisis y predicciones sobre los proyectos.

## Cómo Ejecutar el Proyecto

1. Clona el repositorio.
2. Abre el proyecto en tu IDE favorito.
3. Ejecuta la clase `Main.java` para ver el funcionamiento de la plataforma.
