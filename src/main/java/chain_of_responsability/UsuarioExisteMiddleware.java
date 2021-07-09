package chain_of_responsability;

public class UsuarioExisteMiddleware extends Middleware {
    private Servidor servidor;

    public UsuarioExisteMiddleware(Servidor servidor) {
        this.servidor = servidor;
    }

    @Override
    public boolean checar(String email, String senha) {
        if (!servidor.possuiEmail(email)) {
            System.out.println("Email não registrado");
            return false;
        }
        
        if (!servidor.isSenhaValida(email, senha)) {
            System.out.println("Senha inválida");
            return false;
        }
        
        return checarProximo(email, senha);
    }
}
