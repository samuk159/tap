package builder;

public class Diretor {

    public void construirSedan(Builder builder) {
        builder.setTipoCarro(TipoCarro.SEDAN);
        builder.setAssentos(4);
        builder.setMotor(new Motor(1.0, 100_000));
        builder.setTransmissao(Transmissao.MANUAL);
    }
    
    public void construirSUV(Builder builder) {
        builder.setTipoCarro(TipoCarro.SUV);
        builder.setAssentos(4);
        builder.setMotor(new Motor(2.0, 50_000));
        builder.setTransmissao(Transmissao.AUTOMATICO);
        builder.setGPS(new GPS());
    }
    
    public void construirEsportivo(Builder builder) {
        builder.setTipoCarro(TipoCarro.ESPORTIVO);
        builder.setAssentos(2);
        builder.setMotor(new Motor(3.0, 0));
        builder.setTransmissao(Transmissao.AUTOMATICO);
        builder.setGPS(new GPS());
    }
    
}
