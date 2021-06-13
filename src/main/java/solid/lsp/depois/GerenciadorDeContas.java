package solid.lsp.depois;

public class GerenciadorDeContas {

    private double saldo;

    public GerenciadorDeContas() {
        this.saldo = 0;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void render(double taxa) {
        this.saldo *= taxa;
    }
    
}
