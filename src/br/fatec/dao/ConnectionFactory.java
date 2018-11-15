/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.dao;

import br.fatec.utils.SistemaUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class ConnectionFactory {
   public Connection getConexao() {
        SistemaUtils utils = new SistemaUtils();
        try{            
            return DriverManager.getConnection(utils.getConfigProperty("data-base.config.url.connection"), utils.getConfigProperty("data-base.config.user"), "");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro de conexao: " + e);
        }
        return null;        
     }

}
