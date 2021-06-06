package mediator;

public class BotaoAdicionar implements Componente {
    
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getNome() {
        return "BotaoAdicionar";
    }
    
    public void click() {
        System.out.println("BotaoAdicionar: click");
        mediator.adicionarNovaNota(new Nota());
    }
    
}
