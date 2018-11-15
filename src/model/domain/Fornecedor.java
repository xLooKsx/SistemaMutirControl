/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import br.fatec.dao.FornecedorDao;

/**
 *
 * @author Felipe
 */




public class Fornecedor {
   
    private String cnpj; 
    private String nome; 
    private String endereco;   
    private String telefone;
    private String email;
    private String razao_Social;
    
    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String nome, String endereco, String telefone, String email, String razao_Social) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.razao_Social = razao_Social;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRazao_Social() {
        return razao_Social;
    }

    public void setRazao_Social(String razao_Social) {
        this.razao_Social = razao_Social;
    }
    
    public static ArrayList<Fornecedor> getFornecedor(){
        ArrayList<Fornecedor> fornecedores = new ArrayList();
        return fornecedores;
    }
    
    @Override
    public String toString() {
        return "Fornecedor{" + "cnpj=" + cnpj + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", razao_Social=" + razao_Social + '}';
    }
    
   
}
