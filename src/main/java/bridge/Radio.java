package bridge;

public class Radio implements Dispositivo {
    private boolean ligado = false;
    private int volume = 30;
    private int canal = 1;

    @Override
    public boolean isLigado() {
        return ligado;
    }

    @Override
    public void ligar() {
        ligado = true;
    }

    @Override
    public void desligar() {
        ligado = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int porcentagem) {
        if (porcentagem > 100) {
            this.volume = 100;
        } else if (porcentagem < 0) {
            this.volume = 0;
        } else {
            this.volume = porcentagem;
        }
    }

    @Override
    public int getCanal() {
        return canal;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public void imprimirStatus() {
        System.out.println("Eu sou um rádio");
        System.out.println("Eu estou " + (ligado ? "ligado" : "desligado"));
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }

}
