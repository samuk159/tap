package decorator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String salarios = "Nome,Salario\n"
            + "Joao,3000\n"
            + "Pedro,5000";
        FonteDeDados puro = new FonteDeDadosArquivo("salarios.csv");
        FonteDeDados encriptado = new EncriptacaoDecorator(puro);
        FonteDeDados comprimido = new CompressaoDecorator(encriptado);
        
        puro.escreverDados(salarios);
        System.out.println("Puro: " + puro.lerDados());        
        encriptado.escreverDados(salarios);
        System.out.println("Encriptado: " + encriptado.lerDados());
        comprimido.escreverDados(salarios);
        System.out.println("Comprimido: " + comprimido.lerDados());
    }
}
