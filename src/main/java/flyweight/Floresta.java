/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flyweight;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author samuk159
 */
public class Floresta extends JFrame {
    private List<Arvore> arvores = new ArrayList<>();
    
    public void plantar(int x, int y, String nome, Color cor) {
        TipoArvore tipo = FabricaArvore.getTipoArvore(nome, cor);
        Arvore arvore = new Arvore(x, y, tipo);
        arvores.add(arvore);
    }
    
    @Override
    public void paint(Graphics graphics) {
        for (Arvore arvore : arvores) {
            arvore.desenhar(graphics);
        }
    }
}
