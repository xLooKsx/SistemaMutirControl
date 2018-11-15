/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.domain.Fornecedor;

/**
 *
 * @author Felipe
 */
public class FornecedorController {
    private static Fornecedor objFornecedor;
    
    public static void salvarFornecedor(ArrayList<String> fLista) throws SQLException, ClassNotFoundException{
        objFornecedor.setCnpj(fLista.get(1));
        objFornecedor.setNome(fLista.get(2));
        objFornecedor.setEndereco(fLista.get(3));
        objFornecedor.setTelefone(fLista.get(4));
        objFornecedor.setEmail(fLista.get(5));
        objFornecedor.setRazao_Social(fLista.get(6));
       
        objFornecedor.Salvar();
    }
    
   
    
    public static ArrayList<String[]> getForncedor(){
        ArrayList<String[]> fornecedor = new ArrayList();
        
        ArrayList<Fornecedor> forne = Fornecedor.getFornecedor();
        for(int i=0;i<forne.size();i++){
           String f[] = new String[6];
           f[0] = forne.get(i).getCnpj();
           f[1] = forne.get(i).getNome();
           f[2] = forne.get(i).getEndereco();
           f[3] = forne.get(i).getTelefone();
           f[4] = forne.get(i).getEmail();
           f[5] = forne.get(i).getRazao_Social();
           fornecedor.add(f);
        }
        return fornecedor;
    }
}
