package testpartidos;

public class Ronda {
	    private int numero;
	    private Partido[] partidos;
	    
	    public Ronda(int numero, Partido[] partidos) {
	        this.numero = numero;
	        this.partidos = partidos;
	    }
	    
	    public int getNumero() {
	        return numero;
	    }
	    
	    public Partido[] getPartidos() {
	        return partidos;
	    }
	    public int[] calcularPuntos(Pronostico[] pronosticos) {
	        int puntos = 0;
	        int aciertos = 0;
	        for (int i = 0; i < pronosticos.length; i++) {
	            Partido partido = partidos[i];
	            Pronostico pronostico = pronosticos[i];
	            if (partido.getResultado() == pronostico.getResultado()
	                    && partido.getGolesLocal() == pronostico.getGolesLocal()
	                    && partido.getGolesVisitante() == pronostico.getGolesVisitante()) {
	                puntos += 3;
	                aciertos++;
	            }
	        }
	        return new int[] {puntos, aciertos};
	    }
}
