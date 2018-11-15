/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;
import java.util.Date;

/**
 *
 * @author Felipe
 */
public class Manutencao {
    private int idManutencao;
    private Date dataSolicitacao;
    private Date dataRealizacao;
    private String tipoManutencao;
    private Motorista_Veiculo motorista_cpf;
    private Motorista_Veiculo veiculo_numero_veiculo;
    private Mecanicos mecanicos_cpf;
    private Pecas_Orcadas pecas_orcadas_mecanicos_cpf;
    private Pecas_Orcadas pecas_idPecas;
    private Pecas_Orcadas fornecedor_cnpj;

    public Manutencao() {
    }

    public int getIdManutencao() {
        return idManutencao;
    }

    public void setIdManutencao(int idManutencao) {
        this.idManutencao = idManutencao;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public Motorista_Veiculo getMotorista_cpf() {
        return motorista_cpf;
    }

    public void setMotorista_cpf(Motorista_Veiculo motorista_cpf) {
        this.motorista_cpf = motorista_cpf;
    }

    public Motorista_Veiculo getVeiculo_numero_veiculo() {
        return veiculo_numero_veiculo;
    }

    public void setVeiculo_numero_veiculo(Motorista_Veiculo veiculo_numero_veiculo) {
        this.veiculo_numero_veiculo = veiculo_numero_veiculo;
    }

    public Mecanicos getMecanicos_cpf() {
        return mecanicos_cpf;
    }

    public void setMecanicos_cpf(Mecanicos mecanicos_cpf) {
        this.mecanicos_cpf = mecanicos_cpf;
    }

    public Pecas_Orcadas getPecas_orcadas_mecanicos_cpf() {
        return pecas_orcadas_mecanicos_cpf;
    }

    public void setPecas_orcadas_mecanicos_cpf(Pecas_Orcadas pecas_orcadas_mecanicos_cpf) {
        this.pecas_orcadas_mecanicos_cpf = pecas_orcadas_mecanicos_cpf;
    }

    public Pecas_Orcadas getPecas_idPecas() {
        return pecas_idPecas;
    }

    public void setPecas_idPecas(Pecas_Orcadas pecas_idPecas) {
        this.pecas_idPecas = pecas_idPecas;
    }

    public Pecas_Orcadas getFornecedor_cnpj() {
        return fornecedor_cnpj;
    }

    public void setFornecedor_cnpj(Pecas_Orcadas fornecedor_cnpj) {
        this.fornecedor_cnpj = fornecedor_cnpj;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idManutencao;
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
        final Manutencao other = (Manutencao) obj;
        if (this.idManutencao != other.idManutencao) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Manutencao{" + "idManutencao=" + idManutencao + ", data_Solicitacao=" + dataSolicitacao + ", data_Realizacao=" + dataRealizacao + ", tipo_Manutencao=" + tipoManutencao + ", motorista_cpf=" + motorista_cpf + ", veiculos_numero_veiculo=" + veiculo_numero_veiculo + ", mecanicos_cpf=" + mecanicos_cpf + ", pecas_orcadas_mecanicos_cpf=" + pecas_orcadas_mecanicos_cpf + ", pecas_idPecas=" + pecas_idPecas + ", fornecedor_cnpj=" + fornecedor_cnpj + '}';
    }
    
    
}
