/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Felipe
 */
public class Veiculos {
    
    private String numero_Veiculo;
    private String numero_Chassis;
    private String modelo;
    private String placa;
    private Date ano;
    private String numero_Carroceria;
    private String numero_Fabricacao;

    public Veiculos() {
    }

    public Veiculos(String numero_Veiculo, String numero_Chassis, String modelo, String placa, Date ano, String numero_Carroceria, String numero_Fabricacao) {
        this.numero_Veiculo = numero_Veiculo;
        this.numero_Chassis = numero_Chassis;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.numero_Carroceria = numero_Carroceria;
        this.numero_Fabricacao = numero_Fabricacao;
    }

    public String getNumero_Veiculo() {
        return numero_Veiculo;
    }

    public void setNumero_Veiculo(String numero_Veiculo) {
        this.numero_Veiculo = numero_Veiculo;
    }

    public String getNumero_Chassis() {
        return numero_Chassis;
    }

    public void setNumero_Chassis(String numero_Chassis) {
        this.numero_Chassis = numero_Chassis;
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

    public String getNumero_Carroceria() {
        return numero_Carroceria;
    }

    public void setNumero_Carroceria(String numero_Carroceria) {
        this.numero_Carroceria = numero_Carroceria;
    }

    public String getNumero_Fabricacao() {
        return numero_Fabricacao;
    }

    public void setNumero_Fabricacao(String numero_Fabricacao) {
        this.numero_Fabricacao = numero_Fabricacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.numero_Veiculo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculos other = (Veiculos) obj;
        if (!Objects.equals(this.numero_Veiculo, other.numero_Veiculo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Veiculos{" + "numero_Veiculo=" + numero_Veiculo + ", numero_Chassis=" + numero_Chassis + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", numero_Carroceria=" + numero_Carroceria + ", numero_Fabricacao=" + numero_Fabricacao + '}';
    }
    
}
