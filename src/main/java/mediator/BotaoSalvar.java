package mediator;

public class BotaoSalvar implements Componente {
    
    private Mediator mediator;
    
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getNome() {
        return "BotaoSalvar";
    }
    
    public void click() {
        System.out.println("BotaoSalvar: click");
        mediator.salvar();
    }
    
}
