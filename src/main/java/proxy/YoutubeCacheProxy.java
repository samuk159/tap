package proxy;

import java.util.HashMap;
import java.util.Map;

public class YoutubeCacheProxy implements LibTerceirizadaYoutube {
    private LibTerceirizadaYoutube servicoYoutube;
    private Map<String, Video> cachePopular = new HashMap<>();
    private Map<String, Video> cacheTodos = new HashMap<>();
    
    public YoutubeCacheProxy() {
        this.servicoYoutube = new ClasseLibTerceirizadaYoutube();
    }

    @Override
    public Map<String, Video> videosPopulares() {
        if (cachePopular.isEmpty()) {
            cachePopular = servicoYoutube.videosPopulares();
        } else {
            System.out.println("Buscou lista do cache");
        }
        
        return cachePopular;
    }

    @Override
    public Video getVideo(String id) {
        Video video = cacheTodos.get(id);
        
        if (video == null) {
            video = servicoYoutube.getVideo(id);
            cacheTodos.put(id, video);
        } else {
            System.out.println("Buscou vídeo " + id + " do cache");
        }
        
        return video;
    }
    
    public void reset() {
        cachePopular.clear();
        cacheTodos.clear();
    }

}
