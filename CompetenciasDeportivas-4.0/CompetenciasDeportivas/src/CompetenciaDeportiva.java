import java.util.List;
import java.util.ArrayList;

public class CompetenciaDeportiva {
    private List<Equipo> equipos;
    private EnumDeporte tipoDeporte;
    private List<Deporte> listaDeportes;
    private ModoJuego modoJuego;

    public CompetenciaDeportiva(EnumDeporte tipoDeporte, ModoJuego modoJuego) {
        this.equipos = new ArrayList<>();
        this.tipoDeporte = tipoDeporte;
        this.modoJuego = modoJuego;
        this.listaDeportes = new ArrayList<>();
    }

    public void inscribirEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public EnumDeporte getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(EnumDeporte tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public ModoJuego getModoJuego() {
        return modoJuego;
    }

    public void agregarDeporte(Deporte deporte) {
        listaDeportes.add(deporte);
    }

    public List<Deporte> getListaDeportes() {
        return listaDeportes;
    }

    public Deporte buscarDeportePorNombre(String nombreDeporte) {
        for (Deporte deporte : listaDeportes) {
            if (deporte.getNombre().equals(nombreDeporte)) {
                return deporte;
            }
        }
        return null; // Deporte no encontrado
    }
}