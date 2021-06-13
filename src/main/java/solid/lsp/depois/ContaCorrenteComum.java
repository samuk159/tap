package solid.lsp.depois;

public class ContaCorrenteComum {

    private GerenciadorDeContas gerenciador;

    public ContaCorrenteComum() {
        this.gerenciador = new GerenciadorDeContas();
    }

    public void depositar(double valor) {
        this.gerenciador.depositar(valor);
    }
    
    public void sacar(double valor) {
    	this.gerenciador.sacar(valor);
    }

    public double getSaldo() {
        return this.gerenciador.getSaldo();
    }

    public void render() {
        this.gerenciador.render(0.02);
    }
    
}
