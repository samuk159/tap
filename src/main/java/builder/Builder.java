package builder;

public interface Builder {
    void setTipoCarro(TipoCarro tipo);
    void setAssentos(int assentos);
    void setMotor(Motor motor);
    void setTransmissao(Transmissao transmissao);
    void setGPS(GPS gps);
}
