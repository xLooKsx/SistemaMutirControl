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
public class ManutencaoDto {
    private int idManutencao;
    private Date dataSolicitacao;
    private Date dataRealizacao;
    private String tipoManutencao;
    private MotoristaVeiculoDto motorista_cpf;
    private MotoristaVeiculoDto veiculo_numero_veiculo;
    private MecanicosDto mecanicos_cpf;
    private PecasOrcadasDto pecas_orcadas_mecanicos_cpf;
    private PecasOrcadasDto pecas_idPecas;
    private PecasOrcadasDto fornecedor_cnpj;

    public ManutencaoDto() {
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

    public MotoristaVeiculoDto getMotorista_cpf() {
        return motorista_cpf;
    }

    public void setMotorista_cpf(MotoristaVeiculoDto motorista_cpf) {
        this.motorista_cpf = motorista_cpf;
    }

    public MotoristaVeiculoDto getVeiculo_numero_veiculo() {
        return veiculo_numero_veiculo;
    }

    public void setVeiculo_numero_veiculo(MotoristaVeiculoDto veiculo_numero_veiculo) {
        this.veiculo_numero_veiculo = veiculo_numero_veiculo;
    }

    public MecanicosDto getMecanicos_cpf() {
        return mecanicos_cpf;
    }

    public void setMecanicos_cpf(MecanicosDto mecanicos_cpf) {
        this.mecanicos_cpf = mecanicos_cpf;
    }

    public PecasOrcadasDto getPecas_orcadas_mecanicos_cpf() {
        return pecas_orcadas_mecanicos_cpf;
    }

    public void setPecas_orcadas_mecanicos_cpf(PecasOrcadasDto pecas_orcadas_mecanicos_cpf) {
        this.pecas_orcadas_mecanicos_cpf = pecas_orcadas_mecanicos_cpf;
    }

    public PecasOrcadasDto getPecas_idPecas() {
        return pecas_idPecas;
    }

    public void setPecas_idPecas(PecasOrcadasDto pecas_idPecas) {
        this.pecas_idPecas = pecas_idPecas;
    }

    public PecasOrcadasDto getFornecedor_cnpj() {
        return fornecedor_cnpj;
    }

    public void setFornecedor_cnpj(PecasOrcadasDto fornecedor_cnpj) {
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
        final ManutencaoDto other = (ManutencaoDto) obj;
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
