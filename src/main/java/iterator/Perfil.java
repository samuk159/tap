package iterator;

import java.util.ArrayList;
import java.util.List;

public class Perfil {
    
    private String nome;
    private String email;
    private List<Perfil> amigos = new ArrayList<>();

    public Perfil(String nome) {
        this.nome = nome;
    }

    public void addAmigo(Perfil amigo) {
        amigos.add(amigo);
        amigo.amigos.add(this);
    }
    
    @Override
    public String toString() {
        return nome;
    }
    
    public List<Perfil> getAmigos() {
        return amigos;
    }
    
    //getters e setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
