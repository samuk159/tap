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
public class Circulo extends Forma {
    int raio;
    
    public Circulo(int id, int x, int y, int raio) {
        super(id, x, y);
        this.raio = raio;
    }

    @Override
    String aceitar(Visitante visitante) {
        return visitante.visitarCirculo(this);
    }
}
