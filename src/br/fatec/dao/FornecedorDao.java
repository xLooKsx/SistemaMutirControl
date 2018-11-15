/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.fatec.dtos.FornecedorDto;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe
 */
public class FornecedorDao {

    private ConnectionFactory connectionFactory;
    private Connection connection;
    private ResultSet resultSet;
    private PreparedStatement statement;

    private Logger LOG = Logger.getLogger(FornecedorDao.class.getName());
    
    public FornecedorDao() {
        connectionFactory = new ConnectionFactory();
    }

    public void getFornecedor(FornecedorDto fornecedor) throws SQLException, ClassNotFoundException {
        connection = connectionFactory.getConexao();
        List<FornecedorDto> fornecedorSalvar = new ArrayList<>();
        List<String> cnpj = new ArrayList<>();
        try {
            statement = connection.prepareStatement("select * from Fornecedores");
            LOG.info(statement.toString());
            resultSet = statement.executeQuery();
            while (resultSet.next()) {

                FornecedorDto forn = new FornecedorDto();

                forn.setCnpj(resultSet.getString("cnpj"));

                cnpj.add(forn.getCnpj());

            }
        } catch (SQLException e) {
            LOG.log(Level.INFO, "Erro ao salvar o buscar fornecedor: {0}", e);
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    public void atualizarFornecedor(FornecedorDto fornecedor) throws SQLException {
        connection = connectionFactory.getConexao();
        StringBuilder sqlQuery = new StringBuilder();
        sqlQuery.append("UPDATE ")
                .append("FORNECEDORES ")
                .append("SET ")
                .append("NOME = ?, ")
                .append("ENDERECO = ?, ")
                .append("TELEFONE = ?, ")
                .append("RAZAO_SOCIAL = ? ")
                .append("WHERE ")
                .append("CNPJ = ? ");

        try {
            statement = connection.prepareStatement(sqlQuery.toString());
            statement.setString(1, fornecedor.getNome());
            statement.setString(2, fornecedor.getEndereco());
            statement.setString(3, fornecedor.getTelefone());
            statement.setString(4, fornecedor.getEmail());
            statement.setString(5, fornecedor.getRazao_Social());
            statement.setString(6, fornecedor.getCnpj());
            LOG.info(statement.toString());
            statement.execute();
            statement.close();
        } catch (SQLException e) {            
            LOG.log(Level.INFO, "Erro ao atualizar o fornecedor: {0}", e);
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    public void inserirFornecedor(FornecedorDto fornecedor) throws SQLException {

        connection = connectionFactory.getConexao();
        StringBuilder sqlQuery = new StringBuilder();
        sqlQuery.append("INSERT INTO FORNECEDORES( ")
                .append("CNPJ, ")
                .append("NOME, ")
                .append("ENDERECO, ")
                .append("TELEFONE, ")
                .append("EMAIL, ")
                .append("RAZAO_SOCIAL) ")
                .append("Values(?,?,?,?,?,?) ");

        try {
            statement = connection.prepareStatement(sqlQuery.toString());
            statement.setString(1, fornecedor.getCnpj());
            statement.setString(3, fornecedor.getEndereco());
            statement.setString(4, fornecedor.getTelefone());
            statement.setString(5, fornecedor.getEmail());
            statement.setString(6, fornecedor.getRazao_Social());
            LOG.info(statement.toString());
            statement.execute();
            statement.close();
        } catch (SQLException e) {
            LOG.log(Level.INFO, "Erro ao inserir o fornecedor: {0}", e);
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

}
