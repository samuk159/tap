package adapter;

public class BuracoRedondo {
    private double raio;

    public BuracoRedondo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    
    public boolean cabe(PinoRedondo pino) {
        return this.getRaio() >= pino.getRaio();
    }
}
