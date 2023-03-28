package testpartidos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Leemos los partidos desde el archivo "partidos.txt"
        Partido[] partidos = leerPartidos("partidos.txt");

        // Creamos la ronda
        Ronda ronda = new Ronda(1, partidos);

        // Leemos los pronósticos desde el archivo "pronosticos.txt"
        Pronostico[] pronosticos = leerPronosticos("pronosticos.txt");

        // Obtenemos los puntos obtenidos y la cantidad de aciertos
        int[] resultados = ronda.calcularPuntos(pronosticos);
        int puntos = resultados[0];
        int aciertos = resultados[1];

        // Mostramos los resultados
        System.out.println("Puntos obtenidos: " + puntos);
        System.out.println("Aciertos: "         + aciertos);
    }

    private static Partido[] leerPartidos(String archivo) {
        Partido[] partidos = null;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            int cantidadPartidos = Integer.parseInt(br.readLine());
            partidos = new Partido[cantidadPartidos];

            for (int i = 0; i < cantidadPartidos; i++) {
                String[] datosPartido = br.readLine().split(",");
                Equipo equipoLocal = new Equipo(datosPartido[0], "Local");
                Equipo equipoVisitante = new Equipo(datosPartido[1], "Visitante");
                int golesLocal = Integer.parseInt(datosPartido[2]);
                int golesVisitante = Integer.parseInt(datosPartido[3]);
                partidos[i] = new Partido(equipoLocal, equipoVisitante, golesLocal, golesVisitante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return partidos;
    }

    private static Pronostico[] leerPronosticos(String archivo) {
        Pronostico[] pronosticos = null;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            int cantidadPronosticos = Integer.parseInt(br.readLine());
            pronosticos = new Pronostico[cantidadPronosticos];

            for (int i = 0; i < cantidadPronosticos; i++) {
                String[] datosPronostico = br.readLine().split(",");
                Resultado resultado = Resultado.valueOf(datosPronostico[0]);
                int golesLocal = Integer.parseInt(datosPronostico[1]);
                int golesVisitante = Integer.parseInt(datosPronostico[2]);
                pronosticos[i] = new Pronostico(resultado, golesLocal, golesVisitante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pronosticos;
    }

}
