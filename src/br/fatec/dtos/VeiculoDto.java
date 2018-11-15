/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.dtos;

import java.util.Date;

/**
 *
 * @author Felipe
 */
public class VeiculoDto {
    
    private String numeroVeiculo;
    private String numeroChassis;
    private String modelo;
    private String placa;
    private Date ano;        

    public VeiculoDto() {
        this("", "", "", "", new Date());
    }

    public VeiculoDto(String numeroVeiculo, String numeroChassis, String modelo, String placa, Date ano) {
        this.numeroVeiculo = numeroVeiculo;
        this.numeroChassis = numeroChassis;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;        
    }

    public String getNumeroVeiculo() {
        return numeroVeiculo;
    }

    public void setNumeroVeiculo(String numeroVeiculo) {
        this.numeroVeiculo = numeroVeiculo;
    }

    public String getNumeroChassis() {
        return numeroChassis;
    }

    public void setNumeroChassis(String numeroChassis) {
        this.numeroChassis = numeroChassis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "VeiculoDto{" + "numeroVeiculo=" + numeroVeiculo + ", numeroChassis=" + numeroChassis + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + '}';
    }

}
