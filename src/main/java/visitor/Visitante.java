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
public interface Visitante {
    String visitarCirculo(Circulo circulo);
    String visitarRetangulo(Retangulo retangulo);
    String visitarFormaComposta(FormaComposta formaComposta);
}
