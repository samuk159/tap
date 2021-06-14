package builder;

public class Carro {
    
    private TipoCarro tipo;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    private GPS gps;
    private double combustivel = 0;

    public Carro(TipoCarro tipo, int assentos, Motor motor, Transmissao transmissao, GPS gps) {
        this.tipo = tipo;
        this.assentos = assentos;
        this.motor = motor;
        this.transmissao = transmissao;
        this.gps = gps;
    }

    //getters

    public TipoCarro getTipo() {
        return tipo;
    }

    public int getAssentos() {
        return assentos;
    }

    public Motor getMotor() {
        return motor;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }

    public GPS getGps() {
        return gps;
    }

    public double getCombustivel() {
        return combustivel;
    }

}
