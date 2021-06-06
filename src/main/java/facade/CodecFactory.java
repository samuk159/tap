package facade;

public class CodecFactory {
    public static Codec extrair(ArquivoDeVideo arquivo) {
        String tipo = arquivo.getTipoCodec();
        
        if (tipo.equals("mp4")) {
            System.out.println("CodecFactory: extraindo audio mpeg...");
            return new CodecDeCompressaoMP4();
        } else {
            System.out.println("CodecFactory: extraindo audio ogg...");
            return new CodecDeCompressaoOgg();
        }
    }
}
