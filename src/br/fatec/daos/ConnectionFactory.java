/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class ConnectionFactory {
   

    public static Connection getConexao() {
        Connection conexao = null;
        try{
            String url = "jdbc:mysql://localhost:3306/dbprojetomitur?useTimezone=true&serverTimezone=UTC";
            String usuario = "root";
            String senha = "";
            conexao = DriverManager.getConnection(url,usuario,senha);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro de conexao: " + e);
        }
        return conexao;
     }

}
