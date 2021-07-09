/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstract_factory;

/**
 *
 * @author samuk159
 */
public class BotaoWindows implements Botao {
    @Override
    public void pintar() {
        System.out.println("Você criou um botão Windows");
    }
}
