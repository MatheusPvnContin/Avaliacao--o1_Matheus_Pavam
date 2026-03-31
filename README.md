
##Sistema de Gerenciamento de Produtos - Avaliação 1
Este projeto é uma aplicação desktop desenvolvida para a Avaliação 1 da disciplina de Linguagem de Programação 1 (LP-1) no IFSP (Votuporanga), sob a orientação do Professor Andre Luis Gobbi Primo. Consiste em um sistema de CRUD completo para produtos de um supermercado, com interface gráfica e persistência de dados.

🚀 Tecnologias Utilizadas
Linguagem: Java 21.

Interface Gráfica: Java Swing (DesktopPane / InternalFrames).

Banco de Dados: PostgreSQL 42.7.2.

Gerenciador de Dependências: Maven.

IDE: NetBeans.

Sistema Operacional de Desenvolvimento: Linux Mint.

🏗️ Arquitetura (Padrão MVC)
O projeto foi estruturado seguindo as melhores práticas de separação de responsabilidades:

br.com.avaliacao1.view: Contém as interfaces gráficas (PrincipalVIEW e ProdutoVIEW).

br.com.avaliacao1.ctr: Camada de controle (ProdutoCTR) que faz a ponte entre a View e o Banco.

br.com.avaliacao1.dto: Objetos de Transferência de Dados (ProdutoDTO).

br.com.avaliacao1.dao: Camada de persistência responsável pelo SQL (ProdutoDAO e ConexaoDAO).

✨ Funcionalidades Principais
CRUD Completo: Inserção, consulta (por nome ou ID), alteração e exclusão de produtos.

Validação de Regra de Negócio: O sistema impede o cadastro de descontos superiores a 100%.

Experiência do Usuário (UX):

Campo de Validade com máscara automática (##/##/####).

Controle de janelas para evitar múltiplas abas idênticas abertas ao mesmo tempo.

Interface centralizada e organizada em um JDesktopPane.

🗄️ Estrutura do Banco de Dados
Para rodar o projeto, utilize o seguinte script SQL no seu PostgreSQL:

SQL
CREATE TABLE Produto (
    id_prod SERIAL PRIMARY KEY,
    nome_prod VARCHAR(100),
    desc_max_prod NUMERIC(10,2),
    preco_venda_prod NUMERIC(10,2),
    preco_custo_prod NUMERIC(10,2),
    categoria_prod VARCHAR(50),
    marca_prod VARCHAR(50),
    quantidade_prod INTEGER,
    unidade_prod VARCHAR(10),
    validade_prod VARCHAR(10),
    fornecedor_prod VARCHAR(100),
    localizacao_prod VARCHAR(100)
);
Nota: Certifique-se de ajustar as credenciais de acesso (usuário e senha) no arquivo ConexaoDAO.java antes de executar.

👨‍💻 Autor
Matheus Pavam Contin- Estudante de Sistemas de Informação - IFSP.
