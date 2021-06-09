package strategy;

public class CartaoDeCredito {
    
    private String numero;
    private String data;
    private String codigoSeguranca;

    public CartaoDeCredito(String numero, String data, String codigoSeguranca) {
        this.numero = numero;
        this.data = data;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public String toString() {
        return "CartaoDeCredito{" 
            + "numero=" + numero 
            + ", data=" + data 
            + ", codigoSeguranca=" + codigoSeguranca 
        + '}';
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }
    
}
