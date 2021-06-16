package state;

public abstract class Estado {
    Tocador tocador;

    public Estado(Tocador tocador) {
        this.tocador = tocador;
    }
    
    public abstract String bloquear();
    public abstract String tocar();
    public abstract String proxima();
    public abstract String anterior();
}
