package mediator;

public class Nota {
    
    private String titulo;
    private String texto;

    public Nota() {
        titulo = "Nova nota";
    }

    @Override
    public String toString() {
        return "Nota{" + "titulo=" + titulo + ", texto=" + texto + '}';
    }    
    
    //getters e setters
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }    
    
}
