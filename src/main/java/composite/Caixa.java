package composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Caixa implements Componente {
    private List<Componente> filhos = new ArrayList<>();
    
    public Caixa(Componente... componentes) {
        filhos.addAll(Arrays.asList(componentes));
    }

    public void add(Componente componente) {
        filhos.add(componente);
    }
    
    public void remover(Componente componente) {
        filhos.remove(componente);
    }

    @Override
    public double getPreco() {
        double soma = 0;
        for (Componente filho : filhos) {
            soma += filho.getPreco();
        }
        return soma;
    }   
}
