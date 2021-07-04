package decorator;

import java.io.IOException;

public interface FonteDeDados {
    void escreverDados(String dados) throws IOException;
    String lerDados() throws IOException;
}
