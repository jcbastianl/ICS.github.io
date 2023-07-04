import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear equipos y jugadores
        EquipoInscrito equipoLocal = crearEquipoConJugadores("Equipo Local", scanner);
        EquipoInscrito equipoVisitante = crearEquipoConJugadores("Equipo Visitante", scanner);

        // Crear partido
        Partido partido = new Partido(equipoLocal, equipoVisitante);

        // Jugar partido
        jugarPartido(partido, scanner);

        // Imprimir resultado del partido
        imprimirInformacionPartido(partido);

        scanner.close();
    }

    private static EquipoInscrito crearEquipoConJugadores(String nombreEquipo, Scanner scanner) {
        EquipoInscrito equipo = new EquipoInscrito(nombreEquipo);
        System.out.print("Ingrese la cantidad de jugadores del equipo " + nombreEquipo + ": ");
        int cantidadJugadores = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después del entero

        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
            String nombreJugador = scanner.nextLine();
            Jugador jugador = new Jugador(nombreJugador);
            equipo.agregarJugador(jugador);
        }

        return equipo;
    }

    private static void jugarPartido(Partido partido, Scanner scanner) {
        System.out.println("Iniciando partido entre " + partido.getEquipoLocal().getNombre() +
                " y " + partido.getEquipoVisitante().getNombre());

        Marcador marcador = partido.getMarcador();

        while (true) {
            System.out.println("Ingrese 'L' para agregar un gol al equipo local, 'V' para agregar un gol al equipo visitante, o 'T' para terminar el partido:");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("L")) {
                marcador.agregarGolLocal();
            } else if (opcion.equalsIgnoreCase("V")) {
                marcador.agregarGolVisitante();
            } else if (opcion.equalsIgnoreCase("T")) {
                marcador.terminarPartido();
                break; // Termina el bucle
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private static void imprimirInformacionPartido(Partido partido) {
        System.out.println("Resultado del partido:");
        System.out.println(partido.getEquipoLocal().getNombre() + " vs " + partido.getEquipoVisitante().getNombre());
        System.out.println("Goles del equipo local: " + partido.getMarcador().getGolesLocal());
        System.out.println("Goles del equipo visitante: " + partido.getMarcador().getGolesVisitante());
        System.out.println("Resultado final: " + partido.getMarcador().obtenerResultadoFinal());
        System.out.println("Jugadores del equipo local:");
        for (Jugador jugador : partido.getEquipoLocal().getJugadores()) {
            System.out.println(jugador.getNombre());
        }
        System.out.println("Jugadores del equipo visitante:");
        for (Jugador jugador : partido.getEquipoVisitante().getJugadores()) {
            System.out.println(jugador.getNombre());
        }
    }


}
