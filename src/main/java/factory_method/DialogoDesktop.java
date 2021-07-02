package factory_method;

public class DialogoDesktop extends Dialogo {
    @Override
    public Botao criarBotao() {
        return new BotaoDesktop();
    }
}
