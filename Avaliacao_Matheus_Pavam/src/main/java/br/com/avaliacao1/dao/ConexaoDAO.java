package br.com.avaliacao1.dao;

import java.sql.*;

/**
 * Gerencia a conexao com o PostgreSQL.
 */
public class ConexaoDAO {

    public static Connection con = null;

    public static void ConnectDB() {
        try {
            // Ajuste para o nome do banco que voce criou no pgAdmin
            String dsn = "Avaliacao_1"; 
            String user = "postgres";
            String senha = "postdba"; // Verifique se sua senha e esta mesma

            DriverManager.registerDriver(new org.postgresql.Driver());
            String url = "jdbc:postgresql://localhost:5432/" + dsn;

            con = DriverManager.getConnection(url, user, senha);
            con.setAutoCommit(false); // Mantem o controle manual de transacoes

            if (con == null) {
                System.out.println("Erro ao abrir o banco!");
            }
        } catch (Exception e) {
            System.out.println("Problema ao abrir a base de dados! " + e.getMessage());
        }
    }

    public static void CloseDB() {
        try {
            if (con != null) con.close();
        } catch (Exception e) {
            System.out.println("Problema ao fechar a base de dados! " + e.getMessage());
        }
    }
}