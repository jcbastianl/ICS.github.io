import java.util.ArrayList;
import java.util.List;

public class ModoJuego {
    private List<Equipo> equipos;
    private List<Jornada> jornadas;
    private EnumModoJuego tipo;

    public ModoJuego(EnumModoJuego tipo) {
        this.equipos = new ArrayList<>();
        this.jornadas = new ArrayList<>();
        this.tipo = tipo;
    }

    public void generarEnfrentamientos() {
        switch (tipo) {
            case LIGA:
                generarEnfrentamientosLiga();
                break;
            case TORNEO:
                generarEnfrentamientosTorneo();
                break;
            case DOBLE_ELIMINACION:
                generarEnfrentamientosDobleEliminacion();
                break;
            default:
                System.out.println("Modo de juego no válido");
                break;
        }
    }

    private void generarEnfrentamientosLiga() {
        for (int i = 0; i < equipos.size() - 1; i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                Equipo equipoLocal = equipos.get(i);
                Equipo equipoVisitante = equipos.get(j);
                Partido partidoIda = new Partido((EquipoInscrito) equipoLocal, (EquipoInscrito) equipoVisitante);
                Partido partidoVuelta = new Partido((EquipoInscrito) equipoVisitante, (EquipoInscrito) equipoLocal);
                Jornada jornada = new Jornada();
                jornada.agregarPartido(partidoIda);
                jornada.agregarPartido(partidoVuelta);
                jornadas.add(jornada);
            }
        }
    }

    private void generarEnfrentamientosTorneo() {
        // Implementación para generar enfrentamientos en modo torneo
    }

    private void generarEnfrentamientosDobleEliminacion() {
        // Implementación para generar enfrentamientos en modo doble eliminación
    }
}