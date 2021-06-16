package builder;

public class CarroBuilder implements Builder {

    private TipoCarro tipo;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    private GPS gps;
    
    public Carro getResultado() {
        return new Carro(tipo, assentos, motor, transmissao, gps);
    }
    
    //setters

    @Override
    public void setTipoCarro(TipoCarro tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    @Override
    public void setGPS(GPS gps) {
        this.gps = gps;
    }
    
}
