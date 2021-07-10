/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visitor;

/**
 *
 * @author samuk159
 */
public class Retangulo extends Forma {
    int largura, altura;
    
    public Retangulo(int id, int x, int y, int largura, int altura) {
        super(id, x, y);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    String aceitar(Visitante visitante) {
        return visitante.visitarRetangulo(this);
    }
}
