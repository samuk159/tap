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
public abstract class Forma {
    int id, x, y;

    public Forma(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
    
    abstract String aceitar(Visitante visitante);
}
