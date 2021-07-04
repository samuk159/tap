package decorator;

import java.io.IOException;

public class FonteDeDadosDecorator implements FonteDeDados {
    private FonteDeDados envolvido;

    public FonteDeDadosDecorator(FonteDeDados envolvido) {
        this.envolvido = envolvido;
    }

    @Override
    public void escreverDados(String dados) throws IOException {
        envolvido.escreverDados(dados);
    }

    @Override
    public String lerDados() throws IOException {
        return envolvido.lerDados();
    }  
}
