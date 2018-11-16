/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.dao;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Felipe
 */
public class MecanicoDao {
    private ConnectionFactory connectionFactory;
    private Connection connection;
    private ResultSet resultSet;
    private PreparedStatement statement;
    
    public MecanicoDao() {
        connectionFactory = new ConnectionFactory();
    }
    
     public String senhaMd5(String senha) throws NoSuchAlgorithmException{
        String senhaMd5;
        MessageDigest m=MessageDigest.getInstance("MD5");
        m.update(senha.getBytes(),0,senha.length());
        BigInteger hash = new BigInteger(1, m.digest(senha.getBytes()));
        senhaMd5 = hash.toString(16);
        return senhaMd5;
    }
    
    public boolean consultarLogin(String cpf, String senha) throws SQLException, NoSuchAlgorithmException{
        
        boolean ret = false;
        connection = connectionFactory.getConexao();
        String senhaMd5 = senhaMd5(senha);

            statement = connection.prepareStatement("select * from Mecanicos where cpf =? and senha =?");
            statement.setString(1, cpf);
            statement.setString(2, senhaMd5);
            ResultSet rs = statement.executeQuery();
            if(rs.next())
            {
                ret = true;
            }
            rs.close();
            statement.close();
            return ret;
       
    }
    
    
}
