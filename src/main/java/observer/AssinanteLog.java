package observer;

import java.io.File;

public class AssinanteLog implements Assinante {
    private File arquivoDeLog;
    
    public AssinanteLog(String caminho) {
        this.arquivoDeLog = new File(caminho);
    }

    @Override
    public void atualizar(String tipoEvento, File arquivo) {
        System.out.println("Salvando log no arquivo " + arquivoDeLog);
        System.out.println("A operação " + tipoEvento 
            + " foi executada no arquivo " + arquivo);
    }
}
