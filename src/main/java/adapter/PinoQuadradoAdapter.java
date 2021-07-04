package adapter;

public class PinoQuadradoAdapter extends PinoRedondo {
    private PinoQuadrado pino;

    public PinoQuadradoAdapter(PinoQuadrado pino) {
        this.pino = pino;
    }
    
    @Override
    public double getRaio() {
        //Calcula um raio mínimo de um círculo que cabe neste pino
        return Math.sqrt(
            Math.pow(
                (pino.getLargura() / 2), 
            2) * 2
        );
    }
}
