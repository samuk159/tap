package solid.lsp.antes;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    public static void main(String[] args) {		
	List<ContaCorrenteComum> listaDeContas = new ArrayList<>();
	listaDeContas.add(new ContaCorrenteComum());
	listaDeContas.add(new ContaSalario());
		
	for (ContaCorrenteComum conta : listaDeContas) {
            conta.render();
            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }
    
}
