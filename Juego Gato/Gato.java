//Integrantes 
//Diaz Mendez Alonso 
//Mendoza Palma Arturo
import java.util.Scanner;
import java.util.Random;

public class Gato {
    private static char[][] tablero = new char[3][3];
    private static char simboloJugadorActual;
    private static char simboloJugadorComputadora;
    private static boolean esJugadorComputadora;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inicializarTablero();
        mostrarTablero();

        // Determinar símbolos de los jugadores
        System.out.print("Ingresa el símbolo para el Jugador 1 (X u O): ");
        char simboloJugador1 = scanner.next().toUpperCase().charAt(0);
        simboloJugadorActual = simboloJugador1;

        if (simboloJugadorActual == 'X') {
            simboloJugadorComputadora = 'O';
        } else {
            simboloJugadorComputadora = 'X';
        }

        System.out.print("¿Quieres jugar contra la computadora? (s/n): ");
        String jugarContraComputadora = scanner.next().toLowerCase();
        esJugadorComputadora = jugarContraComputadora.equals("s");

        while (true) {
            jugarPartida(scanner);
            System.out.print("¿Quieres jugar de nuevo? (s/n): ");
            String jugarOtraVez = scanner.next().toLowerCase();
            if (!jugarOtraVez.equals("s")) {
                break;
            }
        }
    }

    private static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    private static void mostrarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static boolean esMovimientoValido(int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ';
    }

    private static void hacerMovimiento(int fila, int columna) {
        tablero[fila][columna] = simboloJugadorActual;
    }

    private static boolean verificarVictoria(char simbolo) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == simbolo && tablero[i][1] == simbolo && tablero[i][2] == simbolo) {
                return true;
            }
            if (tablero[0][i] == simbolo && tablero[1][i] == simbolo && tablero[2][i] == simbolo) {
                return true;
            }
        }

        if (tablero[0][0] == simbolo && tablero[1][1] == simbolo && tablero[2][2] == simbolo) {
            return true;
        }

        if (tablero[0][2] == simbolo && tablero[1][1] == simbolo && tablero[2][0] == simbolo) {
            return true;
        }

        return false;
    }

    private static boolean estaTableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {0
                    return false;
                }
            }
        }
        return true;
    }

    private static void cambiarJugador() {
        if (simboloJugadorActual == 'X') {
            simboloJugadorActual = 'O';
        } else {
            simboloJugadorActual = 'X';
        }
    }

    private static void jugarPartida(Scanner scanner) {
        inicializarTablero();
        simboloJugadorActual = 'X';  // El Jugador 1 siempre comienza con X

        while (true) {
            int fila, columna;

            if (esJugadorComputadora && simboloJugadorActual == simboloJugadorComputadora) {
                System.out.println("Turno de la computadora:");
                Random rand = new Random();
                fila = rand.nextInt(3);
                columna = rand.nextInt(3);
            } else {
                System.out.print("Turno del Jugador " + (simboloJugadorActual == 'X' ? "1" : "2") + ". Ingresa la fila (0-2) y columna (0-2) separadas por espacio: ");
                fila = scanner.nextInt();
                columna = scanner.nextInt();

                while (!esMovimientoValido(fila, columna)) {
                    System.out.println("Movimiento no válido. Inténtalo de nuevo.");
                    System.out.print("Ingresa la fila (0-2) y columna (0-2) separadas por espacio: ");
                    fila = scanner.nextInt();
                    columna = scanner.nextInt();
                }
            }

            hacerMovimiento(fila, columna);
            mostrarTablero();

            if (verificarVictoria(simboloJugadorActual)) {
                System.out.println("¡El Jugador " + (simboloJugadorActual == 'X' ? "1" : "2") + " gana!");
                break;
            } else if (estaTableroLleno()) {
                System.out.println("¡Es un empate!");
                break;
            }

            cambiarJugador();
        }
    }
}