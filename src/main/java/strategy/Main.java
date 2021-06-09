package strategy;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Pedido pedido = new Pedido();
        pedido.addProduto(new Produto("X-Salada", 19.90));
        pedido.addProduto(new Produto("Batata frita", 4.99));
        pedido.addProduto(new Produto("Refrigerante", 3.50));
        
        System.out.println("Escolha uma opção de pagamento: ");
        System.out.println("1 - PayPal");
        System.out.println("2 - Cartão de Crédito");
        
        String opcao = scanner.nextLine();
        PagamentoStrategy estrategia = null;
        
        if (opcao.equals("1")) {
            estrategia = new PagamentoComPayPal();
        } else {
            estrategia = new PagamentoComCartaoDeCredito();
        }
        
        pedido.processar(estrategia);
        System.out.println("Total do pedido: " + pedido.getTotal());
        System.out.println("Confirmar pagamento?");
        String confirmacao = scanner.nextLine();
        
        if (confirmacao.equalsIgnoreCase("S")) {
            estrategia.pagar(pedido.getTotal());
        }
    }
    
}
