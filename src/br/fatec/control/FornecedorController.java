/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.control;

import br.fatec.utils.SistemaUtils;
import model.domain.Fornecedor;

/**
 *
 * @author Felipe
 */
public class FornecedorController {
    private SistemaUtils util = new SistemaUtils(); 
    
    public String salvarFornecedor(Fornecedor novoRegistro) {
        util.validarFornecedor(novoRegistro);
        
        
        return "";
    }
    
}
