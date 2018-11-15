/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.dtos;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Felipe
 */
public class PecaDto {    
    private Date anoFabricacao;
    private String modelo;
    private String descricao;

    public PecaDto() {
        this(new Date(), "", "");
    }

    public PecaDto(Date anoFabricacao, String modelo, String descricao) {
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.descricao = descricao;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "PecaDto{" + "anoFabricacao=" + anoFabricacao + ", modelo=" + modelo + ", descricao=" + descricao + '}';
    }

}
