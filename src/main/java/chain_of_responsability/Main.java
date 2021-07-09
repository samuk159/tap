/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chain_of_responsability;

import java.util.Scanner;

/**
 *
 * @author samuk159
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Servidor servidor = new Servidor();
        servidor.registrar("admin@exemplo.com", "admin");
        servidor.registrar("usuario@exemplo.com", "123");
        
        Middleware middleware = new LimitacaoMiddleware(2);
        Middleware usuarioMiddleware = new UsuarioExisteMiddleware(servidor);
        usuarioMiddleware.ligarCom(new NivelAcessoMiddleware());
        middleware.ligarCom(usuarioMiddleware);        
        servidor.setMiddleware(middleware);
        
        boolean sucesso = false;
        do {
            System.out.println("Insira o email:");
            String email = scanner.nextLine();
            System.out.println("Insira a senha:");
            String senha = scanner.nextLine();
            sucesso = servidor.login(email, senha);
        } while (!sucesso);
    }
}
