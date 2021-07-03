package prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<Forma>();
        
        Circulo circulo = new Circulo();
        circulo.x = 10;
        circulo.y = 20;
        circulo.raio = 15;
        circulo.cor = "Vermelho";
        formas.add(circulo);
        
        Circulo outroCirculo = (Circulo) circulo.clonar();
        formas.add(outroCirculo);
        
        Retangulo retangulo = new Retangulo();
        retangulo.largura = 10;
        retangulo.altura = 20;
        retangulo.cor = "Azul";
        formas.add(retangulo);
        
        List<Forma> copiaDeFormas = new ArrayList<Forma>();
        for (Forma forma : formas) {
            copiaDeFormas.add(forma.clonar());
        }
        
        for (int i = 0; i < formas.size(); i++) {
            if (formas.get(i) == copiaDeFormas.get(i)) {
                System.out.println(i + ": são o mesmo objeto");
            } else {
                System.out.println(i + ": não são o mesmo objeto");
                
                if (formas.get(i).equals(copiaDeFormas.get(i))) {
                    System.out.println(i + ": são idênticos");
                } else {
                    System.out.println(i + ": são diferentes");
                }
            }
        }
        
        CacheDeFormas cacheDeFormas = new CacheDeFormas();
        Forma f1 = cacheDeFormas.get("Circulo Verde Grande");
        Forma f2 = cacheDeFormas.get("Retangulo Azul Médio");
        Forma f3 = cacheDeFormas.get("Retangulo Azul Médio");
        
        System.out.println(f2 == f3);
        System.out.println(f2.equals(f3));
    }
    
}
