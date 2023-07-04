public class DeporteIndividual implements Deporte {
    private String nombre;

    public DeporteIndividual(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    // Implementación de otros métodos específicos para deportes individuales
}