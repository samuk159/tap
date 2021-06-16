package state;

public class ProntoState extends Estado {

    public ProntoState(Tocador tocador) {
        super(tocador);
    }

    @Override
    public String bloquear() {
        tocador.trocarEstado(new BloqueadoState(tocador));
        return "Bloqueado";
    }

    @Override
    public String tocar() {
        String trilha = tocador.iniciarPlayback();
        tocador.trocarEstado(new TocandoState(tocador));
        return trilha;
    }

    @Override
    public String proxima() {
        return "Bloqueado";
    }

    @Override
    public String anterior() {
        return "Bloqueado";
    }
    
}
