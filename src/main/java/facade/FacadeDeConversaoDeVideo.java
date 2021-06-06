package facade;

import java.io.File;

public class FacadeDeConversaoDeVideo {
    public File converterVideo(String nomeArquivo, String formato) {
        System.out.println("FacadeDeConversaoDeVideo: conversão iniciada.");
        ArquivoDeVideo arquivo = new ArquivoDeVideo(nomeArquivo);
        Codec codecFonte = CodecFactory.extrair(arquivo);
        
        Codec codecDestino;
        if (formato.equals("mp4")) {
            codecDestino = new CodecDeCompressaoOgg();
        } else {
            codecDestino = new CodecDeCompressaoMP4();
        }
        
        ArquivoDeVideo buffer = LeitorDeBitrate.ler(arquivo, codecFonte);
        ArquivoDeVideo resultadoIntermediario = LeitorDeBitrate.converter(buffer, codecDestino);
        
        MixerDeAudio mixerDeAudio = new MixerDeAudio();
        File resultado = mixerDeAudio.corrigir(resultadoIntermediario);
        
        System.out.println("FacadeDeConversaoDeVideo: conversão completada.");
        return resultado;
    }
}
