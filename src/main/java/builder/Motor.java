package builder;

public class Motor {

    private double volume;
    private double quilometragem;

    public Motor(double volume, double quilometragem) {
        this.volume = volume;
        this.quilometragem = quilometragem;
    }
    
    //getters e setters
    
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
    
}
