/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flyweight;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author samuk159
 */
public class TipoArvore {
    private String nome;
    private Color cor;

    public TipoArvore(String nome, Color cor) {
        this.nome = nome;
        this.cor = cor;
    }
    
    public void desenhar(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(cor);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
