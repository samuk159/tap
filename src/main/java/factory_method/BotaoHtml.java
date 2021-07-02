package factory_method;

public class BotaoHtml implements Botao {

    @Override
    public void renderizar() {
        System.out.println("<button>Botão</button>");
        clicado();
    }

    @Override
    public void clicado() {
        System.out.println("Botão html foi clicado");
    }

}
