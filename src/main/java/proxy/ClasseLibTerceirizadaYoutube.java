
package proxy;

import java.util.HashMap;
import java.util.Map;

public class ClasseLibTerceirizadaYoutube implements LibTerceirizadaYoutube {

    @Override
    public Map<String, Video> videosPopulares() {
        conectarServidor();
        
        Map<String, Video> map = new HashMap<>();
        map.put("1", new Video("1", "Gatos"));
        map.put("2", new Video("1", "Cachorros"));
        map.put("3", new Video("1", "Barcelo vs RealM"));
        map.put("4", new Video("1", "Como programar"));
        
        return map;
    }

    @Override
    public Video getVideo(String id) {
        conectarServidor();
        System.out.println("Baixando video");
        return new Video(id, "Algum vídeo");
    }

    private void conectarServidor() {
        System.out.println("Conectando em www.youtube.com");
        System.out.println("Conectado");
    }

}
