package bridge;

public class ControleRemotoBasico implements ControleRemoto {
    protected Dispositivo dispositivo;
    
    public ControleRemotoBasico() {}

    public ControleRemotoBasico(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void ligarDesligar() {
        System.out.println("Ligando/Desligando");
        
        if (dispositivo.isLigado()) {
            dispositivo.desligar();
        } else {
            dispositivo.ligar();
        }
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo volume");
        dispositivo.setVolume(dispositivo.getVolume() - 10);
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume");
        dispositivo.setVolume(dispositivo.getVolume() + 10);
    }

    @Override
    public void diminuirCanal() {
        System.out.println("Diminuindo canal");
        dispositivo.setCanal(dispositivo.getCanal() - 1);
    }

    @Override
    public void aumentarCanal() {
        System.out.println("Aumentando canal");
        dispositivo.setCanal(dispositivo.getCanal() + 1);
    }

}
