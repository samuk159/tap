package adapter;

public class Main {
    public static void main(String[] args) {
        BuracoRedondo buraco = new BuracoRedondo(5);
        PinoRedondo pinoRedondo = new PinoRedondo(5);        
        if (buraco.cabe(pinoRedondo)) {
            System.out.println("Pino redondo cabe no buraco redondo");
        }
        
        PinoQuadrado pinoQPeq = new PinoQuadrado(2);
        PinoQuadrado pinoQGrande = new PinoQuadrado(20);
        //buraco.cabe(pinoQPeq);
        
        PinoQuadradoAdapter peqAdapter = new PinoQuadradoAdapter(pinoQPeq);
        PinoQuadradoAdapter grandeAdapter = new PinoQuadradoAdapter(pinoQGrande);
        if (buraco.cabe(peqAdapter)) {
            System.out.println("Pino quadrado pequeno cabe no buraco redondo");
        }
        if (!buraco.cabe(grandeAdapter)) {
            System.out.println("Pino quadrado grande não cabe no buraco redondo");
        }
    }
}
