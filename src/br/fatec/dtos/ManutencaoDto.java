/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.dtos;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class ManutencaoDto {
    
    private Date dataSolicitacao;
    private Date dataRealizacao;
    private String tipoManutencao;
    private MotoristaDto motoristaDto;
    private MecanicoDto mecanicoDto;
    private List<PecaOrcadaDto> pecasOrcadas;

    public ManutencaoDto() {
        this(new Date(), new Date(), "", new MotoristaDto(), new MecanicoDto(), new ArrayList<PecaOrcadaDto>());
    }

    public ManutencaoDto(Date dataSolicitacao, Date dataRealizacao, String tipoManutencao, MotoristaDto motoristaDto, MecanicoDto mecanicoDto, List<PecaOrcadaDto> pecasOrcadas) {
        this.dataSolicitacao = dataSolicitacao;
        this.dataRealizacao = dataRealizacao;
        this.tipoManutencao = tipoManutencao;
        this.motoristaDto = motoristaDto;
        this.mecanicoDto = mecanicoDto;
        this.pecasOrcadas = pecasOrcadas;
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

    public MotoristaDto getMotoristaDto() {
        return motoristaDto;
    }

    public void setMotoristaDto(MotoristaDto motoristaDto) {
        this.motoristaDto = motoristaDto;
    }

    public MecanicoDto getMecanicoDto() {
        return mecanicoDto;
    }

    public void setMecanicoDto(MecanicoDto mecanicoDto) {
        this.mecanicoDto = mecanicoDto;
    }

    public List<PecaOrcadaDto> getPecasOrcadas() {
        return pecasOrcadas;
    }

    public void setPecasOrcadas(List<PecaOrcadaDto> pecasOrcadas) {
        this.pecasOrcadas = pecasOrcadas;
    }

    @Override
    public String toString() {
        return "ManutencaoDto{" + "dataSolicitacao=" + dataSolicitacao + ", dataRealizacao=" + dataRealizacao + ", tipoManutencao=" + tipoManutencao + ", motoristaDto=" + motoristaDto + ", mecanicoDto=" + mecanicoDto + ", pecasOrcadas=" + pecasOrcadas + '}';
    }

    
}
