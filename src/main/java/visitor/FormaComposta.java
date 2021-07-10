/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuk159
 */
public class FormaComposta extends Forma {
    List<Forma> filhos = new ArrayList<>();

    public FormaComposta(int id) {
        super(id, -1, -1);
    }
    
    public void add(Forma forma) {
        filhos.add(forma);
    }

    @Override
    String aceitar(Visitante visitante) {
        return visitante.visitarFormaComposta(this);
    }
}
