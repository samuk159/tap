package prototype;

import java.util.HashMap;
import java.util.Map;

public class CacheDeFormas {
    private Map<String, Forma> cache = new HashMap<>();
    
    public CacheDeFormas() {
        Circulo circulo = new Circulo();
        circulo.x = 5;
        circulo.y = 7;
        circulo.raio = 45;
        circulo.cor = "Verde";
        
        Retangulo retangulo = new Retangulo();
        retangulo.largura = 8;
        retangulo.altura = 10;
        retangulo.cor = "Azul";
        
        cache.put("Circulo Verde Grande", circulo);
        cache.put("Retangulo Azul Médio", retangulo);
    }
    
    public void adicionar(String nome, Forma forma) {
        this.cache.put(nome, forma);
    }
    
    public Forma get(String nome) {
        return cache.get(nome).clonar();
    }
}
