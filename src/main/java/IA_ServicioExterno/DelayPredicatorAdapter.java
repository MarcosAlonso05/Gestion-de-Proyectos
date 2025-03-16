
// Adaptador para el servicio externo

package IA_ServicioExterno;

public class DelayPredicatorAdapter implements DelayPredicator {
    private Analisis_IA externalService;

    public DelayPredicatorAdapter(Analisis_IA externalService) {
        this.externalService = externalService;
    }

    @Override
    public String predict(String taskData) {

        // Adaptar los datos para el servicio externo

        int days = Integer.parseInt(taskData);
        return externalService.predictDelay(days);
    }
}
