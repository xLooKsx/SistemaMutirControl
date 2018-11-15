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

/**
 *
 * @author Felipe
 */
public class FornecedorController {
    private static FornecedorDao objFornecedor;
    private SistemaUtils util = new SistemaUtils();
    
    public String salvarFornecedor(FornecedorDto fornecedor){        
        util.validarFornecedor(fornecedor);
        
        return null;
    }
    
   
    
    public static ArrayList<String[]> getForncedor(){
        return null;
    }
}
