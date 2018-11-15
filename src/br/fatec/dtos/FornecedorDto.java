/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.dtos;
/**
 *
 * @author Felipe
 */

public class FornecedorDto {
   
    private String cnpj; 
    private String nome; 
    private String endereco;   
    private String telefone;
    private String email;
    private String razaoSocial;
    
    public FornecedorDto() {
        this("", "", "", "", "", "");
    }

    public FornecedorDto(String cnpj, String nome, String endereco, String telefone, String email, String razao_Social) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.razaoSocial = razao_Social;
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
        return razaoSocial;
    }

    public void setRazao_Social(String razao_Social) {
        this.razaoSocial = razao_Social;
    }  
    
    @Override
    public String toString() {
        return "Fornecedor{" + "cnpj=" + cnpj + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", razao_Social=" + razaoSocial + '}';
    }
}
