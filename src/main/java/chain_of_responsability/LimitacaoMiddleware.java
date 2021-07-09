package chain_of_responsability;

public class LimitacaoMiddleware extends Middleware {
    private int requisicoesPorMinuto;
    private int requisicao;
    private long tempoAtual;

    public LimitacaoMiddleware(int requisicoesPorMinuto) {
        this.requisicoesPorMinuto = requisicoesPorMinuto;
        this.tempoAtual = System.currentTimeMillis();
    }

    @Override
    public boolean checar(String email, String senha) {
        if (System.currentTimeMillis() > tempoAtual + 60_000) {
            requisicao = 0;
            tempoAtual = System.currentTimeMillis();
        }
        
        requisicao++;
        
        if (requisicao > requisicoesPorMinuto) {
            System.out.println("Limite de requisições atingido");
            Thread.currentThread().stop();
        }
        
        return checarProximo(email, senha);
    }
}
