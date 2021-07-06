package observer;

import java.io.File;

public class AssinanteEmail implements Assinante {
    private String email;

    public AssinanteEmail(String email) {
        this.email = email;
    }

    @Override
    public void atualizar(String tipoEvento, File arquivo) {
        System.out.println("Enviando email para " + email);
        System.out.println("A operação " + tipoEvento 
            + " foi executada no arquivo " + arquivo);
    }
}
