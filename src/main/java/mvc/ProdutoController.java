/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author samuk159
 */
public class ProdutoController {
    
    public List<String[]> listar() throws IOException {
        List<ProdutoModel> models = ProdutoDAO.getInstance().ler();
        return models.stream().map(m -> {
            String[] linha = { 
                m.getNome(),
                String.valueOf(m.getPreco())
            };
            return linha;
        }).collect(Collectors.toList());
    }

    public void salvar(int indice, String nome, Float preco) throws IOException {
        ProdutoModel produto = new ProdutoModel();
        produto.setNome(nome);
        produto.setPreco(preco);
        ProdutoDAO dao = ProdutoDAO.getInstance();
        dao.salvar(indice, produto);
    }
    
    public void excluir(int indice) throws IOException {
        ProdutoDAO.getInstance().excluir(indice);
    }
    
}
