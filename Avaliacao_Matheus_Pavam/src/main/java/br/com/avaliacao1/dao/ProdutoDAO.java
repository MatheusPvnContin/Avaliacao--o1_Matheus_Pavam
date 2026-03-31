
package br.com.avaliacao1.dao;

import java.sql.*;
import br.com.avaliacao1.dto.ProdutoDTO;

public class ProdutoDAO {

    public ProdutoDAO() {}

    private ResultSet rs = null;
    private Statement stmt = null;

    public boolean inserirProduto(ProdutoDTO produtoDTO) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "Insert into Produto (nome_prod, desc_max_prod, preco_venda_prod, "
                    + "preco_custo_prod, categoria_prod, marca_prod, quantidade_prod, "
                    + "unidade_prod, validade_prod, fornecedor_prod, localizacao_prod) values ("
                    + "'" + produtoDTO.getNome_prod() + "', "
                    + produtoDTO.getDesc_max_prod() + ", "
                    + produtoDTO.getPreco_venda_prod() + ", "
                    + produtoDTO.getPreco_custo_prod() + ", "
                    + "'" + produtoDTO.getCategoria_prod() + "', "
                    + "'" + produtoDTO.getMarca_prod() + "', "
                    + produtoDTO.getQuantidade_prod()+ ", "
                    + "'" + produtoDTO.getUnidade_prod() + "', "
                    + "'" + produtoDTO.getValidade_prod() + "', "
                    + "'" + produtoDTO.getFornecedor_prod() + "', "
                    + "'" + produtoDTO.getLocalizacao_prod() + "')";

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao inserir: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }
    
    // Adicione estes métodos dentro da classe ProdutoDAO

public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao) {
    try {
        ConexaoDAO.ConnectDB();
        stmt = ConexaoDAO.con.createStatement();
        String comando = "";

        switch (opcao) {
            case 1: // Pesquisa por nome (Like)
                comando = "Select p.* from Produto p where nome_prod like '" + 
                          produtoDTO.getNome_prod() + "%' order by p.nome_prod";
                break;
            case 2: // Pesquisa por ID exato
                comando = "Select p.* from Produto p where p.id_prod = " + produtoDTO.getId_prod();
                break;
        }
        rs = stmt.executeQuery(comando.toUpperCase());
        return rs;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return rs;
    }
}

public boolean alterarProduto(ProdutoDTO produtoDTO) {
    try {
        ConexaoDAO.ConnectDB();
        stmt = ConexaoDAO.con.createStatement();
        String comando = "Update Produto set "
                + "nome_prod = '" + produtoDTO.getNome_prod() + "', "
                + "desc_max_prod = " + produtoDTO.getDesc_max_prod() + ", "
                + "preco_venda_prod = " + produtoDTO.getPreco_venda_prod() + ", "
                + "preco_custo_prod = " + produtoDTO.getPreco_custo_prod() + ", "
                + "categoria_prod = '" + produtoDTO.getCategoria_prod() + "', "
                + "marca_prod = '" + produtoDTO.getMarca_prod() + "', "
                + "quantidade_prod = " + produtoDTO.getQuantidade_prod() + ", "
                + "unidade_prod = '" + produtoDTO.getUnidade_prod() + "', "
                + "validade_prod = '" + produtoDTO.getValidade_prod() + "', "
                + "fornecedor_prod = '" + produtoDTO.getFornecedor_prod() + "', "
                + "localizacao_prod = '" + produtoDTO.getLocalizacao_prod() + "' "
                + "where id_prod = " + produtoDTO.getId_prod();

        stmt.execute(comando.toUpperCase());
        ConexaoDAO.con.commit();
        stmt.close();
        return true;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return false;
    } finally {
        ConexaoDAO.CloseDB();
    }
    
    
}

public boolean excluirProduto(ProdutoDTO produtoDTO) {
    try {
        ConexaoDAO.ConnectDB();
        stmt = ConexaoDAO.con.createStatement();
        String comando = "Delete from Produto where id_prod = " + produtoDTO.getId_prod();
        stmt.execute(comando);
        ConexaoDAO.con.commit();
        stmt.close();
        return true;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return false;
    } finally {
        ConexaoDAO.CloseDB();
    }
}
    
    
}   