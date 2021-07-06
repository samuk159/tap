package observer;

import java.io.File;

public class Editor {
    public GerenciadorDeEventos gerenciadorDeEventos;
    private File arquivo;
    
    public Editor() {
        this.gerenciadorDeEventos = new GerenciadorDeEventos("abrir", "salvar");
    }
    
    public void abrirArquivo(String caminho) {
        this.arquivo = new File(caminho);
        gerenciadorDeEventos.notificar("abrir", arquivo);
    }
    
    public void salvarArquivo() {
        if (this.arquivo != null) {
            gerenciadorDeEventos.notificar("salvar", arquivo);
        } else {
            System.out.println("Nenhum arquivo aberto");
        }
    }
}
