/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.fatec.dtos.FornecedorDto;

/**
 *
 * @author Felipe
 */
public class FornecedorDao {
   
    
    public static void SalvarFornecedor(FornecedorDto fornecedor) throws SQLException,ClassNotFoundException{
        String codsql = "";
        Connection conexao = new ConnectionFactory().getConexao();
        List<FornecedorDto> fornecedorSalvar = new ArrayList<FornecedorDto>();
        List<String> cnpj = new ArrayList<String>();
        ResultSet rs = null;
        try {
            PreparedStatement sql = conexao.prepareStatement("select * from Fornecedores");
            rs = sql.executeQuery();
            while(rs.next()){
        
                FornecedorDto forn = new FornecedorDto();

                forn.setCnpj(rs.getString("cnpj"));

                cnpj.add(forn.getCnpj());

            }
            sql.close();
        } catch (SQLException e) {
        e.printStackTrace();
        }
        for(String cnpjA : cnpj){
            if(fornecedor.getCnpj() == cnpjA){
                codsql ="UPDATE FORNECEDORES SET NOME = ?, ENDERECO = ?, TELEFONE = ?, EMAIL = ?, RAZAO_SOCIAL = ? "
                        + "WHERE CNPJ = ?";
                try{
                PreparedStatement sql = conexao.prepareStatement(codsql);
                sql.setString(1, fornecedor.getNome());
                sql.setString(2, fornecedor.getEndereco());
                sql.setString(3, fornecedor.getTelefone());
                sql.setString(4, fornecedor.getEmail());
                sql.setString(5, fornecedor.getRazao_Social());
                sql.setString(6, fornecedor.getCnpj());
                sql.execute();
                sql.close();
                return;
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Erro ao executar o update na tabela" + e.getMessage());
                    
                }
            }
        }
        codsql ="INSERT INTO FORNECEDORES (CNPJ, NOME, ENDERECO, TELEFONE, EMAIL,RAZAO_SOCIAL) "
                + "Values(?,?,?,?,?,?)";
        try{PreparedStatement sql = conexao.prepareStatement(codsql);
        sql.setString(1, fornecedor.getCnpj());
        sql.setString(2, fornecedor.getNome());
        sql.setString(3, fornecedor.getEndereco());
        sql.setString(4, fornecedor.getTelefone());
        sql.setString(5, fornecedor.getEmail());
        sql.setString(6, fornecedor.getRazao_Social());
        sql.execute();
        sql.close();
        }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Erro ao executar o insert na tabela" + e.getMessage());
                    return;
                }
    }
    
    
    
    public void excluir(FornecedorDto fornecedor){
           
    }
    public List<FornecedorDto> pesquisa(FornecedorDto fornecedor){
    
        return null;
    }
    
   
    
}
