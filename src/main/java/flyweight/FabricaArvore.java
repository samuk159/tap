/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flyweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author samuk159
 */
public class FabricaArvore {
    private static Map<String, TipoArvore> tiposDeArvore = new HashMap<>();
    
    public static TipoArvore getTipoArvore(String nome, Color cor) {
        TipoArvore tipo = tiposDeArvore.get(nome);
        if (tipo == null) {
            tipo = new TipoArvore(nome, cor);
            tiposDeArvore.put(nome, tipo);
        }
        return tipo;
    }
}
