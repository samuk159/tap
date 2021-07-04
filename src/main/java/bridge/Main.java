package bridge;

public class Main {
    public static void main(String[] args) {
        testarDispositivo(new Tv());
        testarDispositivo(new Radio());
    }
    
    public static void testarDispositivo(Dispositivo dispositivo) {
        System.out.println("Testando com controle remoto básico");
        ControleRemotoBasico basico = new ControleRemotoBasico(dispositivo);
        basico.ligarDesligar();
        dispositivo.imprimirStatus();
        
        System.out.println("Testando com controle remoto avançado");
        ControleRemotoAvancado avancado = new ControleRemotoAvancado(dispositivo);
        avancado.ligarDesligar();
        avancado.mutar();
        dispositivo.imprimirStatus();
    }
}
