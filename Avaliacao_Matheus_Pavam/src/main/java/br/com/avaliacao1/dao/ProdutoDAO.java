
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
                    + "preco_custo_prod, categoria_prod, marca_prod, estoque_prod, "
                    + "unidade_prod, validade_prod, fornecedor_prod, localizacao_prod) values ("
                    + "'" + produtoDTO.getNome_prod() + "', "
                    + produtoDTO.getDesc_max_prod() + ", "
                    + produtoDTO.getPreco_venda_prod() + ", "
                    + produtoDTO.getPreco_custo_prod() + ", "
                    + "'" + produtoDTO.getCategoria_prod() + "', "
                    + "'" + produtoDTO.getMarca_prod() + "', "
                    + produtoDTO.getEstoque_prod() + ", "
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
    
    // Futuramente adicionaremos Consultar, Alterar e Excluir aqui
}   