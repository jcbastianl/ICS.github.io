import java.util.Scanner;

public class Marcador {
    private int golesLocal;
    private int golesVisitante;
    private boolean partidoTerminado;

    public Marcador() {
        golesLocal = 0;
        golesVisitante = 0;
        partidoTerminado = false;
    }

    public void agregarGolLocal() {
        if (!partidoTerminado) {
            golesLocal++;
        } else {
            System.out.println("El partido ha terminado. No se pueden agregar más goles.");
        }
    }

    public void agregarGolVisitante() {
        if (!partidoTerminado) {
            golesVisitante++;
        } else {
            System.out.println("El partido ha terminado. No se pueden agregar más goles.");
        }
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public String obtenerResultadoFinal() {
        if (golesLocal > golesVisitante) {
            return "Gana el equipo local";
        } else if (golesLocal < golesVisitante) {
            return "Gana el equipo visitante";
        } else {
            return "Empate";
        }
    }

    public void terminarPartido() {
        partidoTerminado = true;
        System.out.println("El partido ha terminado. Resultado final: " + obtenerResultadoFinal());
    }
}