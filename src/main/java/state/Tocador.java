package state;

import java.util.ArrayList;
import java.util.List;

public class Tocador {
    private Estado estado;
    private boolean tocando = false;
    private List<String> playlist = new ArrayList<>();
    private int trilhaAtual = 0;
    
    public Tocador() {
        this.estado = new ProntoState(this);
        
        for (int i = 0; i < 10; i++) {
            playlist.add("Trilha " + i);
        }
    }

    public Estado getEstado() {
        return estado;
    }
    
    public void trocarEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    public String iniciarPlayback() {
        return "Tocando " + playlist.get(trilhaAtual);
    }
    
    public String proximaTrilha() {
        trilhaAtual++;
        if (trilhaAtual > playlist.size() - 1) {
            trilhaAtual = 0;
        }
        
        return iniciarPlayback();
    }
    
    public String trilhaAnterior() {
        trilhaAtual--;
        if (trilhaAtual < 0) {
            trilhaAtual = playlist.size() - 1;
        }
        
        return iniciarPlayback();
    }
    
    public void setTrilhaAtualDepoisDeParar() {
        this.trilhaAtual = 0;
    }
}
