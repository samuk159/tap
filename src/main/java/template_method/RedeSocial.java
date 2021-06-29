package template_method;

public abstract class RedeSocial {
    String usuario;
    String senha;

    public RedeSocial(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }   
    
    public boolean publicar(String mensagem) {
        if (login(usuario, senha)) {
            boolean resultado = enviarDados(mensagem.getBytes());
            logout();
            return resultado;
        }
        
        return false;
    }
    
    abstract boolean login(String usuario, String senha);
    abstract boolean enviarDados(byte[] dados);
    abstract void logout();
}
