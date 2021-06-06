package facade;

import java.io.File;

public class Main {
    
    public static void main(String[] args) {
        FacadeDeConversaoDeVideo conversor = new FacadeDeConversaoDeVideo();
        File mp4Video = conversor.converterVideo("arquivo-de-video.ogg", "mp4");
    }
    
}
