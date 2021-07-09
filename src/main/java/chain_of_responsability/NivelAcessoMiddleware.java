/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chain_of_responsability;

/**
 *
 * @author samuk159
 */
public class NivelAcessoMiddleware extends Middleware {

    @Override
    public boolean checar(String email, String senha) {
        if (email.equals("admin@exemplo.com")) {
            System.out.println("Olá admin!");
            return true;
        }
        System.out.println("Olá usuário!");
        return checarProximo(email, senha);
    }

}
