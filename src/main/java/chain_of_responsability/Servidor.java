/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chain_of_responsability;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author samuk159
 */
public class Servidor {
    private Map<String, String> usuarios = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }
    
    public boolean login(String email, String senha) {
        if (middleware.checar(email, senha)) {
            System.out.println("Usuário autorizado");
            //Alguma coisa
            return true;
        }
        
        return false;
    }
    
    public void registrar(String email, String senha) {
        usuarios.put(email, senha);
    }
    
    public boolean possuiEmail(String email) {
        return usuarios.containsKey(email);
    }
    
    public boolean isSenhaValida(String email, String senha) {
        return usuarios.get(email).equals(senha);
    }
}
