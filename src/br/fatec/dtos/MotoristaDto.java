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
public class MotoristaDto {
    private String cpf;
    private String rg;
    private String cnh;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private VeiculoDto veiculo;

    public MotoristaDto() {
        this("", "", "", "", "", "", "", new VeiculoDto());
    }

    public MotoristaDto(String cpf, String rg, String cnh, String nome, String endereco, String telefone, String email, VeiculoDto veiculo) {
        this.cpf = cpf;
        this.rg = rg;
        this.cnh = cnh;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.veiculo = veiculo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
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

    public VeiculoDto getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(VeiculoDto veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "MotoristaDto{" + "cpf=" + cpf + ", rg=" + rg + ", cnh=" + cnh + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", veiculo=" + veiculo + '}';
    }
       
    
}
