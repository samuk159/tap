package state;

public class Main {
    public static void main(String[] args) {
        Tocador tocador = new Tocador();
        UI ui = new UI(tocador);
        ui.init();
    }
}
