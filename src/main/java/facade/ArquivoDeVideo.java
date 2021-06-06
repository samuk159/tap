package facade;

public class ArquivoDeVideo {
    
    private String nome;
    private String tipoCodec;

    public ArquivoDeVideo(String nome) {
        this.nome = nome;
        this.tipoCodec = nome.substring(nome.indexOf(".") + 1);
    }

    //getters e setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoCodec() {
        return tipoCodec;
    }

    public void setTipoCodec(String tipoCodec) {
        this.tipoCodec = tipoCodec;
    }
    
}
