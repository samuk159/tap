package proxy;

public class Main {
    public static void main(String[] args) {
        BaixadorYoutube nativo = new BaixadorYoutube(
            new ClasseLibTerceirizadaYoutube()
        );
        BaixadorYoutube comProxy = new BaixadorYoutube(
            new YoutubeCacheProxy()
        );
        
        System.out.println("Nativo:");
        nativo.mostrarVideosPopulares();
        nativo.mostrarVideo("1");
        nativo.mostrarVideosPopulares();
        nativo.mostrarVideo("2");
        nativo.mostrarVideo("1");
        
        System.out.println("Com proxy:");
        comProxy.mostrarVideosPopulares();
        comProxy.mostrarVideo("1");
        comProxy.mostrarVideosPopulares();
        comProxy.mostrarVideo("2");
        comProxy.mostrarVideo("1");
    }    
}
