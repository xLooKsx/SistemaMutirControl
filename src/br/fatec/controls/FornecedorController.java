/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.controls;


import br.fatec.dao.FornecedorDao;
import java.util.ArrayList;
import br.fatec.dtos.FornecedorDto;
import br.fatec.utils.SistemaUtils;
import java.sql.SQLException;

/**
 *
 * @author Felipe
 */
public class FornecedorController {
    private FornecedorDao objFornecedor;
    private String resultadoVlidacao;
    private final SistemaUtils util = new SistemaUtils();
    
    public String salvarFornecedor(FornecedorDto fornecedor) throws SQLException{                
        resultadoVlidacao = util.validarFornecedor(fornecedor);
        if(resultadoVlidacao.trim().length() > 0){
           resultadoVlidacao = objFornecedor.inserirFornecedor(fornecedor);
        }        
        return resultadoVlidacao;
    }
        
    public static ArrayList<String[]> getForncedor(){
        return null;
    }
}
