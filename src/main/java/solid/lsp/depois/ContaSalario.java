package solid.lsp.depois;

public class ContaSalario {

    private GerenciadorDeContas gerenciador;
	
    public ContaSalario() {
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
    
}
