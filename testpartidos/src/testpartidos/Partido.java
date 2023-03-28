package testpartidos;

public class Partido {
	    private Equipo equipoLocal;
	    private Equipo equipoVisitante;
	    private int golesLocal;
	    private int golesVisitante;
	    private Resultado resultado;
	    
	    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesLocal, int golesVisitante) {
	        this.equipoLocal = equipoLocal;
	        this.equipoVisitante = equipoVisitante;
	        this.golesLocal = golesLocal;
	        this.golesVisitante = golesVisitante;
	        if (golesLocal > golesVisitante) {
	            resultado = Resultado.GANADOR_LOCAL;
	        } else if (golesLocal < golesVisitante) {
	            resultado = Resultado.GANADOR_VISITANTE;
	        } else {
	            resultado = Resultado.EMPATE;
	        }
	    }
	    
	    public Equipo getEquipoLocal() {
	        return equipoLocal;
	    }
	    
	    public Equipo getEquipoVisitante() {
	        return equipoVisitante;
	    }
	    
	    public int getGolesLocal() {
	        return golesLocal;
	    }
	    
	    public int getGolesVisitante() {
	        return golesVisitante;
	    }
	    
	    public Resultado getResultado() {
	        return resultado;
	    }
}
