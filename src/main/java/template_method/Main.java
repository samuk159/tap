package template_method;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Usuário:");
        String usuario = scanner.nextLine();
        System.out.println("Senha:");
        String senha = scanner.nextLine();
        
        System.out.println("Escolha a rede social:\n"
                + "1 - Facebook\n"
                + "2 - Twitter\n");
        String opcao = scanner.nextLine();
        RedeSocial redeSocial = null;
        
        switch (opcao) {
            case "1": 
                redeSocial = new Facebook(usuario, senha);
                break;
            case "2": 
                redeSocial = new Twitter(usuario, senha);
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
        
        System.out.println("Mensagem:");
        String mensagem = scanner.nextLine();
        redeSocial.publicar(mensagem);
    }
    
    public String lerArquivo(String caminho) throws IOException {
        File arquivo = new File(caminho);
        
        /*byte[] dados = Files.readAllBytes(arquivo.toPath());
        String conteudo = new String(dados);*/
        
        String dados = "";
        List<String> linhas = Files.readAllLines(arquivo.toPath());
        
        for (String linha : linhas) {
            String[] campos = linha.split(",");
            
            for (String campo : campos) {
                System.out.println("Campo: " + campo);
                dados += campo;
            }
        }
        
        return dados;
    }
    
}
