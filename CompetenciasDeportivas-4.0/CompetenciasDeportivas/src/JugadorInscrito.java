public class JugadorInscrito {
    private Jugador jugador;
    private EquipoInscrito equipo;

    public JugadorInscrito(Jugador jugador, EquipoInscrito equipo) {
        this.jugador = jugador;
        this.equipo = equipo;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public EquipoInscrito getEquipo() {
        return equipo;
    }
}