/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flyweight;

import java.awt.Graphics;

/**
 *
 * @author samuk159
 */
public class Arvore {
    private int x, y;
    private TipoArvore tipo;

    public Arvore(int x, int y, TipoArvore tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }
    
    public void desenhar(Graphics g) {
        tipo.desenhar(g, x, y);
    }
}
