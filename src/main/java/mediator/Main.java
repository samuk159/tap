package mediator;

public class Main {
    
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        BotaoAdicionar botaoAdicionar = new BotaoAdicionar();
        mediator.adicionarComponente(botaoAdicionar);
        
        BotaoExcluir botaoExcluir = new BotaoExcluir();
        mediator.adicionarComponente(botaoExcluir);
        
        BotaoSalvar botaoSalvar = new BotaoSalvar();
        mediator.adicionarComponente(botaoSalvar);
        
        mediator.adicionarComponente(new Lista());

        mediator.desenharTela();
        
        botaoAdicionar.click();
        botaoSalvar.click();
        botaoExcluir.click();
    }
    
}
