package proxy;

import java.util.Map;

public interface LibTerceirizadaYoutube {
    Map<String, Video> videosPopulares();
    Video getVideo(String id);
}
