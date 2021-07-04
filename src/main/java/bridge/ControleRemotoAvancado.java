package bridge;

public class ControleRemotoAvancado extends ControleRemotoBasico {

    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void mutar() {
        System.out.println("Mutando");
        dispositivo.setVolume(0);
    }
    
}
