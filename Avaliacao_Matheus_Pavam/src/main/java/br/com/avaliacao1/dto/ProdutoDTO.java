package br.com.avaliacao1.dto;

/**
 * Classe de transferência de dados para a entidade Produto.
 * Requisito: Pelo menos 11 informações na tela.
 */
public class ProdutoDTO {
    // Atributos baseados na discussão de funcionalidades
    private String nome_prod, categoria_prod, marca_prod, unidade_prod;
    private String validade_prod, fornecedor_prod, localizacao_prod;
    private int id_prod, estoque_prod;
    private double preco_venda_prod, preco_custo_prod, desc_max_prod;

    // Métodos Getter e Setter para acesso aos dados
    public int getId_prod() { return id_prod; }
    public void setId_prod(int id_prod) { this.id_prod = id_prod; }

    public String getNome_prod() { return nome_prod; }
    public void setNome_prod(String nome_prod) { this.nome_prod = nome_prod; }

    public double getDesc_max_prod() { return desc_max_prod; }
    public void setDesc_max_prod(double desc_max_prod) { this.desc_max_prod = desc_max_prod; }

    public double getPreco_venda_prod() { return preco_venda_prod; }
    public void setPreco_venda_prod(double preco_venda_prod) { this.preco_venda_prod = preco_venda_prod; }

    public double getPreco_custo_prod() { return preco_custo_prod; }
    public void setPreco_custo_prod(double preco_custo_prod) { this.preco_custo_prod = preco_custo_prod; }

    public String getCategoria_prod() { return categoria_prod; }
    public void setCategoria_prod(String categoria_prod) { this.categoria_prod = categoria_prod; }

    public String getMarca_prod() { return marca_prod; }
    public void setMarca_prod(String marca_prod) { this.marca_prod = marca_prod; }

    public int getQuantidade_prod() { return estoque_prod; }
    public void setQuantidade_prod(int estoque_prod) { this.estoque_prod = estoque_prod; }

    public String getUnidade_prod() { return unidade_prod; }
    public void setUnidade_prod(String unidade_prod) { this.unidade_prod = unidade_prod; }

    public String getValidade_prod() { return validade_prod; }
    public void setValidade_prod(String validade_prod) { this.validade_prod = validade_prod; }

    public String getFornecedor_prod() { return fornecedor_prod; }
    public void setFornecedor_prod(String fornecedor_prod) { this.fornecedor_prod = fornecedor_prod; }

    public String getLocalizacao_prod() { return localizacao_prod; }
    public void setLocalizacao_prod(String localizacao_prod) { this.localizacao_prod = localizacao_prod; }
}