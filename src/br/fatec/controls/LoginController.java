/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.controls;

import br.fatec.dao.MecanicoDao;
import br.fatec.dao.MotoristaDao;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

/**
 *
 * @author Felipe
 */
public class LoginController {
    private static MecanicoDao objMecanico;
    private static MotoristaDao objMotorista;
    
    
    
    public boolean efetuarLoginMec(String cpf, String senha) throws SQLException, NoSuchAlgorithmException{
        
 
        return objMecanico.consultarLogin(cpf, senha);
    }
    public boolean efetuarLoginMot(String cpf, String senha) throws SQLException, NoSuchAlgorithmException{
        return objMotorista.consultarLogin(cpf, senha); 
    }
    
}
