/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author samuk159
 */
public class ProdutoDAO {
    private File arquivo;
    private List<ProdutoModel> lista;
    private static ProdutoDAO instancia;
    
    public static ProdutoDAO getInstance() {
        if (instancia == null) {
            instancia = new ProdutoDAO();
        }
        
        return instancia;
    }
    
    private ProdutoDAO() {
        arquivo = new File("dados/produtos.csv");
        
        if (!arquivo.exists()) {
            try {
                arquivo.getParentFile().mkdir();
                arquivo.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public List<ProdutoModel> ler() throws IOException {
        if (lista == null) {
            List<String> linhas = Files.readAllLines(arquivo.toPath());
            
            lista = new ArrayList<>();

            for (int i = 0; i < linhas.size(); i++) {
                String linha = linhas.get(i);
                
                if (!linha.trim().isEmpty()) {
                    String[] colunas = linha.split(",");                    
                    ProdutoModel model = new ProdutoModel();
                    model.setNome(colunas[0]);
                    model.setPreco(Float.parseFloat(colunas[1]));
                    lista.add(model);
                }
            }
        }
        
        return lista;
    }
    
    private void salvarArquivo() throws IOException {
        String texto = "";
        
        for (ProdutoModel model : lista) {
            String[] colunas = new String[2];
            colunas[0] = model.getNome();
            colunas[1] = String.valueOf(model.getPreco());
            String linha = String.join(",", colunas);
            texto += linha + "\n";
        }
        
        FileUtils.writeStringToFile(arquivo, texto, "UTF-8");
    }
    
    public void salvar(int indice, ProdutoModel model) throws IOException {
        ler();
        if (indice > -1) {
            lista.set(indice, model);
        } else {
            lista.add(model);
        }
        salvarArquivo();
    }
    
    public void excluir(int indice) throws IOException {
        ler();
        lista.remove(indice);
        salvarArquivo();
    }
}
