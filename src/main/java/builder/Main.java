package builder;

public class Main {

    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        
        CarroBuilder carroBuilder = new CarroBuilder();
        diretor.construirEsportivo(carroBuilder);        
        Carro carro = carroBuilder.getResultado();
        System.out.println("Carro construído: " + carro.getTipo());
        
        ManualBuilder manualBuilder = new ManualBuilder();
        diretor.construirEsportivo(manualBuilder);
        Manual manual = manualBuilder.getResultado();
        System.out.println("Manual construído: " + manual.imprimir());
    }
    
}
