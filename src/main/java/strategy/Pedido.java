package strategy;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    List<Produto> produtos = new ArrayList<>();
    
    public void processar(PagamentoStrategy estrategia) {
        estrategia.coletarDetalhesDePagamento();
    }
    
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public Double getTotal() {
        return produtos.stream().mapToDouble(p -> p.getPreco()).sum();
    }
    
}
