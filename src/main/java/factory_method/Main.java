package factory_method;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma plataforma:\n"
                + "1 - HTML\n"
                + "2 - Desktop\n");
        String opcao = scanner.nextLine();
        Dialogo dialogo = null;
        
        switch (opcao) {
            case "1": 
                dialogo = new DialogoHtml();
                break;
            case "2": 
                dialogo = new DialogoDesktop();
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
        
        dialogo.renderizarTela();
    }
    
}
