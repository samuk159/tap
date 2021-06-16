package builder;

public class Manual {

    private TipoCarro tipo;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    private GPS gps;

    public Manual(
        TipoCarro tipo, int assentos, Motor motor, 
        Transmissao transmissao, GPS gps
    ) {
        this.tipo = tipo;
        this.assentos = assentos;
        this.motor = motor;
        this.transmissao = transmissao;
        this.gps = gps;
    }
    
    public String imprimir() {
        String info = "";
        info += "Tipo: " + tipo + "\n";
        info += "Número de assentos: " + assentos + "\n";
        info += "Motor: Volume: " + motor.getVolume() 
            + " - Quilometragem: " + motor.getQuilometragem() + "\n";
        info += "Transmissão: " + transmissao + "\n";
        info += (gps != null ? "Com GPS" : "Sem GPS") + "\n";
        
        return info;
    }

    //getters

    public TipoCarro getTipo() {
        return tipo;
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

    public int getAssentos() {
        return assentos;
    }

}
