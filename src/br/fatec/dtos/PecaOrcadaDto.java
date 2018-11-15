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
public class PecaOrcadaDto {
    private MecanicoDto mecanicoDto;
    private PecaFornecedorDto pecaFornecedorDto;    
    private Integer quantidade;
    private Double valor;

    public PecaOrcadaDto() {
        this(new MecanicoDto(), new PecaFornecedorDto(), 0, 0.0);
    }

    public PecaOrcadaDto(MecanicoDto mecanicoDto, PecaFornecedorDto pecaFornecedorDto, Integer quantidade, Double valor) {
        this.mecanicoDto = mecanicoDto;
        this.pecaFornecedorDto = pecaFornecedorDto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public MecanicoDto getMecanicoDto() {
        return mecanicoDto;
    }

    public void setMecanicoDto(MecanicoDto mecanicoDto) {
        this.mecanicoDto = mecanicoDto;
    }

    public PecaFornecedorDto getPecaFornecedorDto() {
        return pecaFornecedorDto;
    }

    public void setPecaFornecedorDto(PecaFornecedorDto pecaFornecedorDto) {
        this.pecaFornecedorDto = pecaFornecedorDto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "PecasOrcadasDto{" + "mecanicoDto=" + mecanicoDto + ", pecaFornecedorDto=" + pecaFornecedorDto + ", quantidade=" + quantidade + ", valor=" + valor + '}';
    }

   
}
