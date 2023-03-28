package testpartidos;

public class Juego {
	  private Ronda[] rondas;

	    public Juego(Ronda[] rondas) {
	        this.rondas = rondas;
	    }

	    public Ronda[] getRondas() {
	        return rondas;
	    }

	    public boolean adivino(Pronostico[] pronosticos) {
	        int aciertos = 0;
	        for (int i = 0; i < pronosticos.length; i++) {
	            Partido partido = rondas[i / 2].getPartidos()[i % 2];
	            Pronostico pronostico = pronosticos[i];
	            if (pronostico.getResultado() == partido.getResultado() && 
	                pronostico.getGolesLocal() == partido.getGolesLocal() &&
	                pronostico.getGolesVisitante() == partido.getGolesVisitante()) {
	                aciertos++;
	            }
	        }
	        return aciertos == pronosticos.length;
	    }
}
