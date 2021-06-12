package solid.ocp.depois;

import solid.ocp.antes.Produto;

public class CalculadoraDePrecos {
	
    private TabelaDePreco tabela;
    private ServicoDeFrete frete;

    public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeFrete frete) {
        this.tabela = tabela;
        this.frete = frete;
    }

    public double calcula(Produto produto) {
        double desconto = tabela.calculaDesconto(produto.getValor());
        double valorFrete = frete.calculaFrete(produto.getEstado());
        return produto.getValor() * (1 - desconto) + valorFrete;
    }
}
