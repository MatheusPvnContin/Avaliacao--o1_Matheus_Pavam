package br.com.avaliacao1.ctr;

import java.sql.ResultSet;
import br.com.avaliacao1.dao.ConexaoDAO;
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
    
    public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao) {
    return produtoDAO.consultarProduto(produtoDTO, opcao);
}

public String alterarProduto(ProdutoDTO produtoDTO) {
    try {
        if (produtoDAO.alterarProduto(produtoDTO)) {
            return "Produto alterado com sucesso!";
        } else {
            return "Produto NÃO alterado!";
        }
    } catch (Exception e) {
        return e.getMessage();
    }
}

public String excluirProduto(ProdutoDTO produtoDTO) {
    try {
        if (produtoDAO.excluirProduto(produtoDTO)) {
            return "Produto excluído com sucesso!";
        } else {
            return "Produto NÃO excluído!";
        }
    } catch (Exception e) {
        return e.getMessage();
    }
}

public void CloseDB() {
    ConexaoDAO.CloseDB();
}

}