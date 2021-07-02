package factory_method;

public abstract class Dialogo {

    public void renderizarTela() {
        //Outros códigos
        Botao botaoOk = criarBotao();
        botaoOk.renderizar();
    }

    public abstract Botao criarBotao();
    
}
