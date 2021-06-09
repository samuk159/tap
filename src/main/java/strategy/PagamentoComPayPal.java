package strategy;

import java.util.Scanner;

public class PagamentoComPayPal implements PagamentoStrategy {
    
    private String email;
    private String senha;
    private boolean logado = false;

    @Override
    public boolean pagar(Double valor) {
        if (logado) {
            System.out.println("Pagando " + valor + " com PayPal");
            return true;
        } else {
            System.out.println("Pagamento não aprovado");
            return false;
        }
    }

    @Override
    public void coletarDetalhesDePagamento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu email:");
        email = scanner.nextLine();
        System.out.println("Insira sua senha:");
        senha = scanner.nextLine();
        
        if (email.equals("teste@teste.com") && senha.equals("123")) {
            System.out.println("Login efetuado com sucesso");
            logado = true;
        } else {
            System.out.println("Email ou senha incorreto");
            logado = false;
        }
    }
    
}
