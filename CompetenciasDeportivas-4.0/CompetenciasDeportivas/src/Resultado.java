import java.util.ArrayList;
import java.util.List;

public class Resultado {
    private CompetenciaDeportiva competencia;
    private List<EquipoInscrito> ganadores;
    private List<EquipoInscrito> perdedores;

    public Resultado(CompetenciaDeportiva competencia) {
        this.competencia = competencia;
        ganadores = new ArrayList<>();
        perdedores = new ArrayList<>();
    }

    public void registrarGanador(EquipoInscrito equipoInscrito) {
        ganadores.add(equipoInscrito);
    }

    public void registrarPerdedor(EquipoInscrito equipoInscrito) {
        perdedores.add(equipoInscrito);
    }

    public List<EquipoInscrito> getGanadores() {
        return ganadores;
    }

    public List<EquipoInscrito> getPerdedores() {
        return perdedores;
    }
}