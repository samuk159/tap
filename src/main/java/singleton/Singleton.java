package singleton;

public class Singleton {
    
    private static Singleton instancia;
    public String valor;

    private Singleton(String valor) {
        // O código à seguir simula uma inicialização lenta
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        this.valor = valor;
    }

    public static Singleton getInstance(String valor) {
        if (instancia == null) {
            instancia = new Singleton(valor);
        }
        
        return instancia;
    }
    
}
