package state;

public class BloqueadoState extends Estado {

    public BloqueadoState(Tocador tocador) {
        super(tocador);
        tocador.setTocando(false);
    }

    @Override
    public String bloquear() {
        if (tocador.isTocando()) {
            tocador.trocarEstado(new ProntoState(tocador));
            return "Parar de tocar";
        } else {
            return "Bloqueado";
        }
    }

    @Override
    public String tocar() {
        tocador.trocarEstado(new ProntoState(tocador));
        return "Pronto";
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
