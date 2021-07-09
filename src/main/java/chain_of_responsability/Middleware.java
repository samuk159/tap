package chain_of_responsability;

public abstract class Middleware {
    private Middleware proximo;
    
    public void ligarCom(Middleware proximo) {
        this.proximo = proximo;
    }
    
    public abstract boolean checar(String email, String senha);
    
    protected boolean checarProximo(String email, String senha) {
        if (proximo == null) {
            return true;
        }
        return proximo.checar(email, senha);
    }
}
