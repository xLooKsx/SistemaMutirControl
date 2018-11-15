/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.dtos;

import java.util.Objects;

/**
 *
 * @author Felipe
 */
public class MotoristaVeiculoDto {
    private MotoristaDto motorista_cpf;
    private VeiculosDto veiculo_numero_veiculo;

    public MotoristaVeiculoDto() {
    }

    public MotoristaVeiculoDto(MotoristaDto motorista_cpf, VeiculosDto veiculo_numero_veiculo) {
        this.motorista_cpf = motorista_cpf;
        this.veiculo_numero_veiculo = veiculo_numero_veiculo;
    }

    public MotoristaDto getMotorista_cpf() {
        return motorista_cpf;
    }

    public void setMotorista_cpf(MotoristaDto motorista_cpf) {
        this.motorista_cpf = motorista_cpf;
    }

    public VeiculosDto getVeiculo_numero_veiculo() {
        return veiculo_numero_veiculo;
    }

    public void setVeiculo_numero_veiculo(VeiculosDto veiculo_numero_veiculo) {
        this.veiculo_numero_veiculo = veiculo_numero_veiculo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.motorista_cpf);
        hash = 37 * hash + Objects.hashCode(this.veiculo_numero_veiculo);
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
        final MotoristaVeiculoDto other = (MotoristaVeiculoDto) obj;
        if (!Objects.equals(this.motorista_cpf, other.motorista_cpf)) {
            return false;
        }
        if (!Objects.equals(this.veiculo_numero_veiculo, other.veiculo_numero_veiculo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Motorista_Veiculo{" + "motoristas_cpf=" + motorista_cpf + ", veiculos_numero_veiculo=" + veiculo_numero_veiculo + '}';
    }
    
}
