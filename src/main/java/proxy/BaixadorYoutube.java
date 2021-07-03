package proxy;

import java.util.Map;

public class BaixadorYoutube {
    private LibTerceirizadaYoutube api;
    
    public BaixadorYoutube(LibTerceirizadaYoutube api) {
        this.api = api;
    }
    
    public void mostrarVideo(String id) {
        Video video = api.getVideo(id);
        System.out.println("Vídeo:");
        System.out.println("ID: " + video.id);
        System.out.println("Título: " + video.titulo);
        System.out.println("Vídeo: " + video.dados);
    }
    
    public void mostrarVideosPopulares() {
        Map<String, Video> videosPopulares = api.videosPopulares();
        System.out.println("Vídeos populares:");
        for (Video video : videosPopulares.values()) {
            System.out.println("ID: " + video.id + " - Título: " + video.titulo);
        }
    }    
}
