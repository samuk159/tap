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
public class Main {
    public static void main(String[] args) {
        FabricaGUI fabrica;
        String sistemaOperacional = System.getProperty("os.name").toLowerCase();
        //String sistemaOperacional = "mac";
        System.out.println("Sistema operacional: " + sistemaOperacional);
        if (sistemaOperacional.contains("mac")) {
            fabrica = new FabricaMac();
        } else {
            fabrica = new FabricaWindows();
        }       
        
        Aplicacao aplicacao = new Aplicacao(fabrica);
        aplicacao.pintar();
    }
}
