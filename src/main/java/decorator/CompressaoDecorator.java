package decorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressaoDecorator extends FonteDeDadosDecorator {

    public CompressaoDecorator(FonteDeDados envolvido) {
        super(envolvido);
    }
    
    @Override
    public void escreverDados(String dados) throws IOException {
        System.out.println("Comprimindo dados");
        String dadosComprimidos = comprimir(dados);
        super.escreverDados(dadosComprimidos);
    }

    @Override
    public String lerDados() throws IOException {
        System.out.println("Descomprimindo dados");
        String dadosComprimidos = super.lerDados();
        return descomprimir(dadosComprimidos);
    }  
    
    private String comprimir(String dados) {
        byte[] bytes = dados.getBytes();
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(baos, new Deflater(6));
            dos.write(bytes);
            dos.close();
            baos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException ex) {
            return null;
        }
    }

    private String descomprimir(String dados) {
        byte[] bytes = Base64.getDecoder().decode(dados);
        try {
            InputStream in = new ByteArrayInputStream(bytes);
            InflaterInputStream iin = new InflaterInputStream(in);
            ByteArrayOutputStream baos = new ByteArrayOutputStream(512);
            int b;
            while ((b = iin.read()) != -1) {
                baos.write(b);
            }
            in.close();
            iin.close();
            baos.close();
            return new String(baos.toByteArray());
        } catch (IOException ex) {
            return null;
        }
    }

}
