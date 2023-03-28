package testpartidos;

public class Pronostico {
	private Resultado resultado;
    private int golesLocal;
    private int golesVisitante;
    
    public Pronostico(Resultado resultado, int golesLocal, int golesVisitante) {
        this.resultado = resultado;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }
    
    public Resultado getResultado() {
        return resultado;
    }
    
    public int getGolesLocal() {
        return golesLocal;
    }
    
    public int getGolesVisitante() {
        return golesVisitante;
    }
}
