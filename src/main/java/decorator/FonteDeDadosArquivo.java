package decorator;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FonteDeDadosArquivo implements FonteDeDados {
    private String nome;

    public FonteDeDadosArquivo(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void escreverDados(String dados) throws IOException {
        System.out.println("Escrevendo dados");
        File arquivo = new File(nome);
        System.out.println(arquivo.getAbsolutePath());
        FileUtils.writeStringToFile(arquivo, dados, "UTF-8");
    }

    @Override
    public String lerDados() throws IOException {
        System.out.println("Lendo dados");
        return FileUtils.readFileToString(new File(nome), "UTF-8");
    }
}
