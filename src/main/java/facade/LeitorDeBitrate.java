package facade;

public class LeitorDeBitrate {
    public static ArquivoDeVideo ler(ArquivoDeVideo arquivo, Codec codec) {
        System.out.println("LeitorDeBitrate: lendo arquivo...");
        return arquivo;
    }

    public static ArquivoDeVideo converter(ArquivoDeVideo buffer, Codec codec) {
        System.out.println("LeitorDeBitrate: escrevendo arquivo...");
        return buffer;
    }
}
