package template_method;

public class Twitter extends RedeSocial {

    public Twitter(String usuario, String senha) {
        super(usuario, senha);
    }   

    @Override
    boolean login(String usuario, String senha) {
        System.out.println("Checando credenciais do usuário " + usuario);
        System.out.println("Usuário logado no twitter");
        return true;
    }

    @Override
    boolean enviarDados(byte[] dados) {
        System.out.println("Mensagem " + new String(dados) + " postada no twitter");
        return true;
    }

    @Override
    void logout() {
        System.out.println("usuário " + usuario + " deslogado do twitter");
    }

}
