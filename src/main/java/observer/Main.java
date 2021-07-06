package observer;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.gerenciadorDeEventos.inscrever(
            "abrir", new AssinanteLog("log.txt")
        );
        editor.gerenciadorDeEventos.inscrever(
            "salvar", new AssinanteEmail("admin@exemplo.com")
        );
        editor.abrirArquivo("teste.txt");
        editor.salvarArquivo();
    }
}
