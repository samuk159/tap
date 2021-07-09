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
public class FabricaWindows implements FabricaGUI {
    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }
    @Override
    public Checkbox criarCheckbox() {
        return new CheckboxWindows();
    }
}
