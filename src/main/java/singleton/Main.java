package singleton;

public class Main {
    
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("A");
        Singleton outroSingleton = Singleton.getInstance("B");
        System.out.println(singleton.valor);
        System.out.println(outroSingleton.valor);
    }
    
}
