package solid.lsp.antes;

public class ContaSalario extends ContaCorrenteComum {	
    public void rende() throws Exception {
        throw new Exception("Essa conta não possui rendimento");
    }  
}
