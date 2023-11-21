/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import models.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giancarlomarques
 */
public class ClienteDAO {

    static String urlDB = "jdbc:mysql://localhost:3306/perfumaria";
    static String login = "root";
    static String senha = "Gon@5514";

    public static boolean salvarCliente(Cliente cliente) {

        boolean salvo = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            // 1 - idenfiicar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2 - abrir conexão com BD
            conexao = DriverManager.getConnection(urlDB, login, senha);
            System.out.println("Conectado");
            // 3 - preparara o comando SQL
            comandoSQL = conexao.prepareStatement("INSERT INTO cliente "
                    + "(nomeCliente, email) "
                    + "VALUES (?, ?)", +PreparedStatement.RETURN_GENERATED_KEYS);

            comandoSQL.setString(1, cliente.getNome());
            comandoSQL.setString(2, cliente.getEmail());
            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    while (rs.next()) {
                        int idGerado = rs.getInt(1);
                        cliente.setIdCliente(idGerado);
                    }
                }
                salvo = true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return salvo;
    }

    public static ArrayList<Cliente> listarClientes() {
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs;
        ArrayList<Cliente> listaProdutos = new ArrayList<Cliente>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(urlDB, login, senha);
            System.out.println("Conectado");
            comandoSQL = conexao.prepareStatement("SELECT * FROM produto");
            rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int idCliente = rs.getInt("idCliente");
                    String nomeCliente = rs.getString("nomeCliente");
                    String email = rs.getString("email");
                    String categoria = rs.getString("categoria");
                    Cliente produto = new Cliente(idCliente, nomeCliente, email);
                    listaProdutos.add(produto);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return listaProdutos;
    }

    public static boolean atualizarCliente(Cliente cliente) {

        boolean atualizado = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(urlDB, login, senha);
            System.out.println("Conectado");
            comandoSQL = conexao.prepareStatement("UPDATE produto set precoProduto=?, qtdProduto=? WHERE idProduto=?");

            comandoSQL.setString(1, cliente.getNome());
            comandoSQL.setString(1, cliente.getEmail());
            comandoSQL.setInt(3, cliente.getIdCliente());

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {

                atualizado = true;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return atualizado;
    }

    public static boolean excluirCliente(int id) {

        boolean atualizado = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(urlDB, login, senha);
            System.out.println("Conectado");
            comandoSQL = conexao.prepareStatement(
                    "DELETE FROM cliente WHERE idCliente = ?");

            comandoSQL.setInt(1, id);

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {

                atualizado = true;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return atualizado;
    }
}
