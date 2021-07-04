package decorator;

import java.io.IOException;
import java.util.Base64;

public class EncriptacaoDecorator extends FonteDeDadosDecorator {

    public EncriptacaoDecorator(FonteDeDados envolvido) {
        super(envolvido);
    }
    
    @Override
    public void escreverDados(String dados) throws IOException {
        System.out.println("Encriptando dados");
        byte[] bytes = dados.getBytes();
        String dadosEncriptados = Base64.getEncoder().encodeToString(bytes);
        super.escreverDados(dadosEncriptados);
    }

    @Override
    public String lerDados() throws IOException {
        System.out.println("Desencriptando dados");
        String dadosEncriptados = super.lerDados();
        byte[] bytes = Base64.getDecoder().decode(dadosEncriptados);
        return new String(bytes);
    }  
}
