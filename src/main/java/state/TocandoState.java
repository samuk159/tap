package state;

public class TocandoState extends Estado {

    public TocandoState(Tocador tocador) {
        super(tocador);
    }

    @Override
    public String bloquear() {
        tocador.trocarEstado(new BloqueadoState(tocador));
        tocador.setTrilhaAtualDepoisDeParar();
        return "Bloqueado";
    }

    @Override
    public String tocar() {
        tocador.trocarEstado(new ProntoState(tocador));
        return "Pausado";
    }

    @Override
    public String proxima() {
        return tocador.proximaTrilha();
    }

    @Override
    public String anterior() {
        return tocador.trilhaAnterior();
    }
    
}
