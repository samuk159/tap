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
public class Aplicacao {
    private Botao botao;
    private Checkbox checkbox;
    
    public Aplicacao(FabricaGUI fabrica) {
        botao = fabrica.criarBotao();
        checkbox = fabrica.criarCheckbox();
    }
    
    public void pintar() {
        botao.pintar();
        checkbox.pintar();
    }
}
