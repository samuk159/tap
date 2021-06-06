package mediator;

public class BotaoExcluir implements Componente {
    
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getNome() {
        return "BotaoExcluir";
    }
    
    public void click() {
        System.out.println("BotaoExcluir: click");
        mediator.excluirNota();
    }
    
}
