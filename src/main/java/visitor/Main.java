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
public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(1, 10, 55, 8);
        Retangulo r2 = new Retangulo(2, 4, 9, 20, 10);
        
        FormaComposta f3 = new FormaComposta(3);
        f3.add(c1);
        f3.add(r2);
        
        Circulo c4 = new Circulo(4, 5, 62, 15);
        
        VisitanteExportacaoXML visitante = new VisitanteExportacaoXML();
        System.out.println(visitante.exportar(c4, f3));
    }
}
