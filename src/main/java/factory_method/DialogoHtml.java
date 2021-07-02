package factory_method;

public class DialogoHtml extends Dialogo {
    @Override
    public Botao criarBotao() {
        return new BotaoHtml();
    }
}
