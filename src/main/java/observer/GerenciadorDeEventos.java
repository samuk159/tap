package observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorDeEventos {
    Map<String, List<Assinante>> inscricoes = new HashMap<>();
    
    public GerenciadorDeEventos(String... operacoes) {
        for (String operacao : operacoes) {
            inscricoes.put(operacao, new ArrayList<>());
        }
    }
    
    public void inscrever(String tipoEvento, Assinante assinante) {
        List<Assinante> inscritos = inscricoes.get(tipoEvento);
        inscritos.add(assinante);
    }
    
    public void desinscrever(String tipoEvento, Assinante assinante) {
        List<Assinante> inscritos = inscricoes.get(tipoEvento);
        inscritos.remove(assinante);
    }
    
    public void notificar(String tipoEvento, File arquivo) {
        List<Assinante> inscritos = inscricoes.get(tipoEvento);
        for (Assinante inscrito : inscritos) {
            inscrito.atualizar(tipoEvento, arquivo);
        }
    }
}
