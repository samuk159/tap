    package strategy;

import java.util.Scanner;

public class PagamentoComCartaoDeCredito implements PagamentoStrategy {

    CartaoDeCredito cartao;
    
    @Override
    public boolean pagar(Double valor) {
        if (cartao != null) {
            System.out.println("Pagando " + valor + " com cartão de crédito");
            return true;
        } else {
            System.out.println("Pagamento não aprovado");
            return false;
        }
    }

    @Override
    public void coletarDetalhesDePagamento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Número:");
        String numero = scanner.nextLine();
        System.out.println("Data:");
        String data = scanner.nextLine();
        System.out.println("Código de segurança:");
        String codigoSeguranca = scanner.nextLine();
        
        cartao = new CartaoDeCredito(numero, data, codigoSeguranca);
        
        //Validar cartão
    }
    
}
