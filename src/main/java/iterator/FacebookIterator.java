package iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class FacebookIterator implements IteratorDePerfis {

    private List<Perfil> visitados = new ArrayList<>();
    private Queue<Perfil> fila = new LinkedList<>();
    
    public FacebookIterator(Perfil perfil) {
        fila.addAll(perfil.getAmigos());
        visitados.add(perfil);
    }
    
    @Override
    public boolean hasNext() {
        return !fila.isEmpty();
    }

    @Override
    public Perfil getNext() {
        Perfil perfil = fila.poll();
        
        fila.addAll(
            perfil.getAmigos().stream()
            .filter(p -> !visitados.contains(p) && !fila.contains(p))
            .collect(Collectors.toList())
        );
        
        visitados.add(perfil);        
        return perfil;
    }
    
}
