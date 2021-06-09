package strategy;

public interface PagamentoStrategy {
    
    boolean pagar(Double valor);
    void coletarDetalhesDePagamento();
    
}
