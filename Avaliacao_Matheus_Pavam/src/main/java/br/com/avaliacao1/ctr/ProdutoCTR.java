package br.com.avaliacao1.ctr;

import br.com.avaliacao1.dto.ProdutoDTO;
import br.com.avaliacao1.dao.ProdutoDAO;

public class ProdutoCTR {
    ProdutoDAO produtoDAO = new ProdutoDAO();

    public ProdutoCTR() {}

    public String inserirProduto(ProdutoDTO produtoDTO) {
        try {
            if (produtoDAO.inserirProduto(produtoDTO)) {
                return "Produto cadastrado com sucesso!";
            } else {
                return "Produto NÃO cadastrado!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}