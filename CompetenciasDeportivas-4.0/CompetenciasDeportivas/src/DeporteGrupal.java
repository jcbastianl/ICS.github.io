public class DeporteGrupal implements Deporte {
    private String nombre;

    public DeporteGrupal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    // Implementación de otros métodos específicos para deportes grupales
}